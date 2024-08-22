import React, { useState } from 'react';
import './Pagination.css';


interface PaginationProps {
    setCurrentPage: (pageNumber: number) => void;
    totalPages: number;
}

const Pagination: React.FC<PaginationProps> = (props) => {
    const { setCurrentPage, totalPages } = props;
    const [pageNumber, setPageNumber] = useState<number>(1);
    setCurrentPage(pageNumber);

    const nextPage = (command: string) => {
        if (command === "next") {
            if (pageNumber < totalPages) {
                setPageNumber(pageNumber + 1);
                setCurrentPage(pageNumber + 1);
            }
        } else {
            if (pageNumber > 1) {
                setPageNumber(pageNumber - 1);
                setCurrentPage(pageNumber - 1);
            }
        }
    }

    const jumpPage = (jumpTo: number) => {
        if (jumpTo >= 1 && jumpTo <= totalPages) {
            setPageNumber(jumpTo);
            setCurrentPage(jumpTo);
        }
    }
    
    const visiblePageNumber = (localPageNumber: number) => {
        if (localPageNumber >= 1 && localPageNumber <= totalPages) {
            return <li><a href="#" onClick={() => jumpPage(localPageNumber)}>{localPageNumber}</a></li>
        }
        return null;
    }

    return (
        <ul className="pagination">
            <li className={pageNumber <= 1 ? "disabled" : ""}>
                <a href="#" onClick={() => jumpPage(1)}>« First</a>
            </li>
            <li className={pageNumber <= 1 ? "disabled" : ""}>
                <a href="#" onClick={() => nextPage("prev")}>‹ Prev</a>
            </li>
            {visiblePageNumber(pageNumber - 1)}
            <li className="active">
                <a href="#">{pageNumber}</a>
            </li>
            {visiblePageNumber(pageNumber + 1)}
            {visiblePageNumber(pageNumber + 2)}
            {visiblePageNumber(pageNumber + 3)}
            <li className={pageNumber >= totalPages ? "disabled" : ""}>
                <a href="#" onClick={() => nextPage("next")}>Next ›</a>
            </li>
            <li className={pageNumber >= totalPages ? "disabled" : ""}>
                <a href="#" onClick={() => jumpPage(totalPages)}>Last »</a>
            </li>
        </ul>
    );
};

export default Pagination;
