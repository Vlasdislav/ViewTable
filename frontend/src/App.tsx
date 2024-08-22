import React, { useState, useEffect, useRef } from 'react';
import axios from 'axios';
import Table, { ArticleData } from './components/Table/Table';
import Pagination from './components/Pagination/Pagination';
import './App.css';

const App: React.FC = () => {
  const [articles, setArticles] = useState<ArticleData[]>([]);
  const [totalPages, setTotalPages] = useState<number>(0);
  const [currentPage, setCurrentPage] = useState<number>(1);
  const [loading, setLoading] = useState<boolean>(false);
  const isFetching = useRef(false);

  const apiURL = 'http://localhost:8086/api/articles/page/';

  useEffect(() => {
    const fetchData = async () => {
      if (isFetching.current) {
        return;
      }
      setLoading(true);
      isFetching.current = true;
      try {
        const response = await axios.get(apiURL + `${currentPage}`);
        if (totalPages === 0) {
          setTotalPages(response.data.totalPages);
        }
        setArticles(response.data.content);
      } finally {
        isFetching.current = false;
        setLoading(false);
      }
    };

    fetchData();
  }, [currentPage]);

  return (
    <div className="App">
      <Pagination setCurrentPage={(page) => setCurrentPage(page)} totalPages={totalPages} />
      {loading ? <div className="loader"></div> : <Table data={articles} />}
    </div>
  );
}

export default App;
