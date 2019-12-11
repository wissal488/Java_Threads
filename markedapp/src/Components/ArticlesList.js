import React, {Component} from 'react';
class ArticlePage extends Component{
    render(){
        console.log("this.props");
        return(
            <div>
                {this.props.articles.map((article)=>{
                return(<Link to="/">
                <h1>{article.titre}</h1></Link>)})}
            </div>
        );
    }
}
export default ArticlesList;