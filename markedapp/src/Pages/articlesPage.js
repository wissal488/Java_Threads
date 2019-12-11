import  React, {Component} from 'react';
import articles from '../articles';
class articlesPage extends Component{
    render(){
        const name=this.props.match.params.name;
        const article=articles.find((art)=>art.name===name);
        //console.log("this.props");
        return(
            <div>
                <h1>{articles.titre}</h1>
                {article.paragraphes.map((p)=><p>(p)</p>)}
            </div>
        );
    }
}
export default articlesPage;