import React from 'react'
import './Table.css'


export interface ArticleData {
    id: number;                        // BIGINT, PRIMARY KEY
    articleid: number;                 // INTEGER, NOT NULL
    subarticleid: number;              // INTEGER, NOT NULL
    articlename: string;               // VARCHAR(80), NOT NULL
    external_str_id?: string;          // VARCHAR(14), может быть NULL
    ecrlongname: string;               // VARCHAR(128), NOT NULL
    ecrsectionid: number;              // INTEGER, NOT NULL
    sectionname: string;               // VARCHAR(55), NOT NULL
    articlebarcode?: string;           // VARCHAR(64), может быть NULL
    unitname: string;                  // VARCHAR(7), NOT NULL
    sectiontype: string;               // VARCHAR(12), NOT NULL
    rest?: number;                     // INTEGER, может быть NULL
    flgbase: string;                   // VARCHAR(11), NOT NULL
    subarticlebarcode?: string;        // VARCHAR(64), может быть NULL
    flg_disable: string;               // VARCHAR(14), NOT NULL
    flg_disable_name: string;          // VARCHAR(10), NOT NULL
    preparemoment_name: string;        // VARCHAR(11), NOT NULL
    baseprice?: number;                // INTEGER, может быть NULL
    ecological_class?: boolean;        // BIT, может быть NULL
    articletype: string;               // VARCHAR(12), NOT NULL
    article_type_name: string;         // VARCHAR(16), NOT NULL
    tax_system: string;                // VARCHAR(5), NOT NULL
    tag_1212?: number;                 // INTEGER, может быть NULL
    tag_1162: string;                  // VARCHAR(24), NOT NULL
    tag_1162_name: string;             // VARCHAR(3), NOT NULL
    subarticle_marking: string;        // VARCHAR(24), NOT NULL
    subarticle_marking_name: string;   // VARCHAR(3), NOT NULL
    has_any_bc_marking: string;        // VARCHAR(24), NOT NULL
    has_mrc: boolean;                  // BIT, NOT NULL
    isloto: boolean;                   // BIT, NOT NULL
    class_path: string;                // VARCHAR(39), NOT NULL
    strpath: string;                   // VARCHAR(98), NOT NULL
}
  

interface DataTableProps {
    data: ArticleData[];
}

const Table: React.FC<DataTableProps> = ({data}) => {
    if (data.length === 0) {
        return <div>No data available</div>;
    }

    const headers = Object.keys(data[0]);

    return (
        <table className="styled-table">
            <thead>
                <tr>
                {headers.map((header) => (
                    <th key={header}>{header}</th>
                ))}
                </tr>
            </thead>
            <tbody>
                {data.map((item) => (
                <tr key={item.id}>
                    {headers.map((header) => (
                    <td key={header}>{item[header as keyof ArticleData]}</td>
                    ))}
                </tr>
                ))}
            </tbody>
        </table>
    )
}

export default Table;
