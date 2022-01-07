var data = [
    {
    word: 'Pascaline'
    },
    {
    word: 'Difference engine'
    },
    {
    word: "MooresLaw"
    },
    {
    word: 'FuzzyLogic'
    },
    {
    word: 'Algorithm'
    },
    {
    word: 'TuringTest'
    },
    {
    word: 'Boolean'
    },
    {
    word: 'Vacuum tube'
    },
    {
    word: 'Abacus'
    },
    {
    word: 'Relational'
    }
];
class Header extends React.Component {
    render() {
        return (
            <header>
                <h2>CS 319</h2>
            </header>
        );
    }
}

class Nav extends React.Component {
    render() {
        return(
            <nav>
                <ul>
                {this.props.menu_items.map(function(item){return <li key={item}>{item}</li>})}
                </ul>
                <form onSubmit = {this.props.handleAddItem}>
                    <input type="text" name="new_item" />
                    <button>Add Item</button> 
                </form>
            </nav>
        );
    }
}



class Article extends React.Component {
    handleChange(){

    }
    render() {
        return (
            <table className="puzzle">
     <tr className="row0">
   <td className="cell cell0" ></td>
   <td className="cell cell1"  ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3" ></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7" ></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11" ></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16"><input type="text" ref="answer0016" placeholder="1" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row1">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3" ></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7" ></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11" ></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16"><input type="text" ref="answer0116" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row2">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3" ></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7" ></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11" ></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16"><input type="text" ref="answer0216" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row3">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3" ></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7" ></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11"><input type="text" ref="answer0311" placeholder="2" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16"><input type="text" ref="answer0316" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row4">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3" ></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7" ></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11"><input type="text" ref="answer0411" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16"><input type="text" ref="answer0416" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row5">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3"><input type="text" ref="answer0503" placeholder="3" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7" ></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11"><input type="text" ref="answer0511" placeholder="4" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12"><input type="text" ref="answer0512" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell13"><input type="text" ref="answer0513" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell14"><input type="text" ref="answer0514" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell15"><input type="text" ref="answer0515" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell16"><input type="text" ref="answer0516" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell17"><input type="text" ref="answer0517" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell18"><input type="text" ref="answer0518" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell19"><input type="text" ref="answer0519" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell20"><input type="text" ref="answer0520" maxLength="1" onChange={this.handleChange} /></td>
 </tr>
 <tr className="row6">
   <td className="cell cell0"><input type="text" ref="answer0600" placeholder="5" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell1"><input type="text" ref="answer0601" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell2"><input type="text" ref="answer0602" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell3"><input type="text" ref="answer0603" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell4"><input type="text" ref="answer0604" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell5"><input type="text" ref="answer0605" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell6"><input type="text" ref="answer0606" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell7"><input type="text" ref="answer0607" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell8"><input type="text" ref="answer0608" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11"><input type="text" ref="answer0611" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16"><input type="text" ref="answer0616" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row7">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3"><input type="text" ref="answer0703" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7" ></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11"><input type="text" ref="answer0711" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16"><input type="text" ref="answer0716" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row8">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3"><input type="text" ref="answer0803" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7" ></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9"><input type="text" ref="answer0809" placeholder="6" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell10"><input type="text" ref="answer0810" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell11"><input type="text" ref="answer0811" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12"><input type="text" ref="answer0812" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell13"><input type="text" ref="answer0813" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell14"><input type="text" ref="answer0814" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell15"><input type="text" ref="answer0815" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell16"><input type="text" ref="answer0816" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell17"><input type="text" ref="answer0817" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell18"><input type="text" ref="answer0818" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row9">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3"><input type="text" ref="answer0903" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7" ></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11"><input type="text" ref="answer0911" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16" ></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row10">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3"><input type="text" ref="answer1003" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5"><input type="text" ref="answer1005" placeholder="7" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell6"><input type="text" ref="answer1006" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell7"><input type="text" ref="answer1007" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell8"><input type="text" ref="answer1008" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell9"><input type="text" ref="answer1009" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell10"><input type="text" ref="answer1010" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell11"><input type="text" ref="answer1011" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16" ></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row11">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3"><input type="text" ref="answer1103" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7" ></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11"><input type="text" ref="answer1111" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16" ></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row12">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2"><input type="text" ref="answer1202" placeholder="8" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell3"><input type="text" ref="answer1203" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell4"><input type="text" ref="answer1204" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell5"><input type="text" ref="answer1205" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell6"><input type="text" ref="answer1206" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell7"><input type="text" ref="answer1207" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell8"><input type="text" ref="answer1208" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell9"><input type="text" ref="answer1209" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell10"><input type="text" ref="answer1210" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell11"><input type="text" ref="answer1211" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16" ></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row13">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3"><input type="text" ref="answer1303" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7" ></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11"><input type="text" ref="answer1311" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16" ></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row14">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3" ></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7" ></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11"><input type="text" ref="answer1411" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16" ></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row15">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3" ></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7"><input type="text" ref="answer1507" placeholder="9" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11"><input type="text" ref="answer1511" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16" ></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row16">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3" ></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7"><input type="text" ref="answer1607" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11"><input type="text" ref="answer1611" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16" ></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row17">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3" ></td>
   <td className="cell cell4"><input type="text" ref="answer1704" placeholder="10" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell5"><input type="text" ref="answer1705" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell6"><input type="text" ref="answer1706" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell7"><input type="text" ref="answer1707" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell8"><input type="text" ref="answer1708" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell9"><input type="text" ref="answer1709" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell10"><input type="text" ref="answer1710" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell11"><input type="text" ref="answer1711" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12"><input type="text" ref="answer1712" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell13"><input type="text" ref="answer1713" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16" ></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row18">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3" ></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7"><input type="text" ref="answer1807" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11"><input type="text" ref="answer1811" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16" ></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row19">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3" ></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7"><input type="text" ref="answer1907" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11" ></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16" ></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
 <tr className="row20">
   <td className="cell cell0" ></td>
   <td className="cell cell1" ></td>
   <td className="cell cell2" ></td>
   <td className="cell cell3" ></td>
   <td className="cell cell4" ></td>
   <td className="cell cell5" ></td>
   <td className="cell cell6" ></td>
   <td className="cell cell7"><input type="text" ref="answer2007" maxLength="1" onChange={this.handleChange} /></td>
   <td className="cell cell8" ></td>
   <td className="cell cell9" ></td>
   <td className="cell cell10" ></td>
   <td className="cell cell11" ></td>
   <td className="cell cell12" ></td>
   <td className="cell cell13" ></td>
   <td className="cell cell14" ></td>
   <td className="cell cell15" ></td>
   <td className="cell cell16" ></td>
   <td className="cell cell17" ></td>
   <td className="cell cell18" ></td>
   <td className="cell cell19" ></td>
   <td className="cell cell20" ></td>
 </tr>
   </table>
        );
    }
}

class Acomponent extends React.Component {
    render() {
        const divStyle = {
            color: 'green',
            textAlign: 'center',
        };
        return (<div>
            <p style={divStyle}> A simple react component with inline style</p>
        </div>);
    }
}

class Footer extends React.Component {
    render() {
        return (
            <footer>
                <p>Class of 2020</p>
            </footer>
        );
    }
}




// Start Coding here

class App extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            menu_items : ['Introduction', 'Basics', 'Javascript'],
            data : ['Pascaline','Difference engine', "MooresLaw",'FuzzyLogic','Algorithm','TuringTest','Boolean','Vacuum tube','Abacus','Relational']
        };
        this.handleAddItem = this.handleAddItem.bind(this);
    }
    handleAddItem(event){
        event.preventDefault();
        const new_item = event.target.elements.new_item.value.trim();

        if(!new_item){
            alert('enter valid input')
        }
        this.setState(function(prevState, props){
            return{
                menu_items: prevState.menu_items.concat(new_item)
            };
        });
    }
    render(){
        return(
            <div>
                {/* <Header />
                <Nav menu_items = {this.state.menu_items} handleAddItem={this.handleAddItem}/> */}
                <Article />
                {/* <Footer />
                <Acomponent /> */}
            </div>
        );
    }
}
ReactDOM.render(<App />,document.getElementById("app"));


