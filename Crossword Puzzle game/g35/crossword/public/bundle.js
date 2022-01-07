'use strict';

var _createClass = function () { function defineProperties(target, props) { for (var i = 0; i < props.length; i++) { var descriptor = props[i]; descriptor.enumerable = descriptor.enumerable || false; descriptor.configurable = true; if ("value" in descriptor) descriptor.writable = true; Object.defineProperty(target, descriptor.key, descriptor); } } return function (Constructor, protoProps, staticProps) { if (protoProps) defineProperties(Constructor.prototype, protoProps); if (staticProps) defineProperties(Constructor, staticProps); return Constructor; }; }();

function _classCallCheck(instance, Constructor) { if (!(instance instanceof Constructor)) { throw new TypeError("Cannot call a class as a function"); } }

function _possibleConstructorReturn(self, call) { if (!self) { throw new ReferenceError("this hasn't been initialised - super() hasn't been called"); } return call && (typeof call === "object" || typeof call === "function") ? call : self; }

function _inherits(subClass, superClass) { if (typeof superClass !== "function" && superClass !== null) { throw new TypeError("Super expression must either be null or a function, not " + typeof superClass); } subClass.prototype = Object.create(superClass && superClass.prototype, { constructor: { value: subClass, enumerable: false, writable: true, configurable: true } }); if (superClass) Object.setPrototypeOf ? Object.setPrototypeOf(subClass, superClass) : subClass.__proto__ = superClass; }

var data = [{
    word: 'Pascaline'
}, {
    word: 'Difference engine'
}, {
    word: "MooresLaw"
}, {
    word: 'FuzzyLogic'
}, {
    word: 'Algorithm'
}, {
    word: 'TuringTest'
}, {
    word: 'Boolean'
}, {
    word: 'Vacuum tube'
}, {
    word: 'Abacus'
}, {
    word: 'Relational'
}];

var Header = function (_React$Component) {
    _inherits(Header, _React$Component);

    function Header() {
        _classCallCheck(this, Header);

        return _possibleConstructorReturn(this, (Header.__proto__ || Object.getPrototypeOf(Header)).apply(this, arguments));
    }

    _createClass(Header, [{
        key: 'render',
        value: function render() {
            return React.createElement(
                'header',
                null,
                React.createElement(
                    'h2',
                    null,
                    'CS 319'
                )
            );
        }
    }]);

    return Header;
}(React.Component);

var Nav = function (_React$Component2) {
    _inherits(Nav, _React$Component2);

    function Nav() {
        _classCallCheck(this, Nav);

        return _possibleConstructorReturn(this, (Nav.__proto__ || Object.getPrototypeOf(Nav)).apply(this, arguments));
    }

    _createClass(Nav, [{
        key: 'render',
        value: function render() {
            return React.createElement(
                'nav',
                null,
                React.createElement(
                    'ul',
                    null,
                    this.props.menu_items.map(function (item) {
                        return React.createElement(
                            'li',
                            { key: item },
                            item
                        );
                    })
                ),
                React.createElement(
                    'form',
                    { onSubmit: this.props.handleAddItem },
                    React.createElement('input', { type: 'text', name: 'new_item' }),
                    React.createElement(
                        'button',
                        null,
                        'Add Item'
                    )
                )
            );
        }
    }]);

    return Nav;
}(React.Component);

var Article = function (_React$Component3) {
    _inherits(Article, _React$Component3);

    function Article() {
        _classCallCheck(this, Article);

        return _possibleConstructorReturn(this, (Article.__proto__ || Object.getPrototypeOf(Article)).apply(this, arguments));
    }

    _createClass(Article, [{
        key: 'handleChange',
        value: function handleChange() {}
    }, {
        key: 'render',
        value: function render() {
            return React.createElement(
                'table',
                { className: 'puzzle' },
                React.createElement(
                    'tr',
                    { className: 'row0' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement('td', { className: 'cell cell3' }),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement('td', { className: 'cell cell7' }),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement('td', { className: 'cell cell11' }),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell16' },
                        React.createElement('input', { type: 'text', ref: 'answer0016', placeholder: '1', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row1' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement('td', { className: 'cell cell3' }),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement('td', { className: 'cell cell7' }),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement('td', { className: 'cell cell11' }),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell16' },
                        React.createElement('input', { type: 'text', ref: 'answer0116', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row2' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement('td', { className: 'cell cell3' }),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement('td', { className: 'cell cell7' }),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement('td', { className: 'cell cell11' }),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell16' },
                        React.createElement('input', { type: 'text', ref: 'answer0216', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row3' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement('td', { className: 'cell cell3' }),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement('td', { className: 'cell cell7' }),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer0311', placeholder: '2', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell16' },
                        React.createElement('input', { type: 'text', ref: 'answer0316', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row4' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement('td', { className: 'cell cell3' }),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement('td', { className: 'cell cell7' }),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer0411', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell16' },
                        React.createElement('input', { type: 'text', ref: 'answer0416', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row5' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell3' },
                        React.createElement('input', { type: 'text', ref: 'answer0503', placeholder: '3', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement('td', { className: 'cell cell7' }),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer0511', placeholder: '4', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell12' },
                        React.createElement('input', { type: 'text', ref: 'answer0512', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell13' },
                        React.createElement('input', { type: 'text', ref: 'answer0513', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell14' },
                        React.createElement('input', { type: 'text', ref: 'answer0514', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell15' },
                        React.createElement('input', { type: 'text', ref: 'answer0515', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell16' },
                        React.createElement('input', { type: 'text', ref: 'answer0516', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell17' },
                        React.createElement('input', { type: 'text', ref: 'answer0517', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell18' },
                        React.createElement('input', { type: 'text', ref: 'answer0518', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell19' },
                        React.createElement('input', { type: 'text', ref: 'answer0519', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell20' },
                        React.createElement('input', { type: 'text', ref: 'answer0520', maxLength: '1', onChange: this.handleChange })
                    )
                ),
                React.createElement(
                    'tr',
                    { className: 'row6' },
                    React.createElement(
                        'td',
                        { className: 'cell cell0' },
                        React.createElement('input', { type: 'text', ref: 'answer0600', placeholder: '5', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell1' },
                        React.createElement('input', { type: 'text', ref: 'answer0601', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell2' },
                        React.createElement('input', { type: 'text', ref: 'answer0602', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell3' },
                        React.createElement('input', { type: 'text', ref: 'answer0603', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell4' },
                        React.createElement('input', { type: 'text', ref: 'answer0604', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell5' },
                        React.createElement('input', { type: 'text', ref: 'answer0605', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell6' },
                        React.createElement('input', { type: 'text', ref: 'answer0606', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell7' },
                        React.createElement('input', { type: 'text', ref: 'answer0607', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell8' },
                        React.createElement('input', { type: 'text', ref: 'answer0608', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer0611', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell16' },
                        React.createElement('input', { type: 'text', ref: 'answer0616', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row7' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell3' },
                        React.createElement('input', { type: 'text', ref: 'answer0703', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement('td', { className: 'cell cell7' }),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer0711', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell16' },
                        React.createElement('input', { type: 'text', ref: 'answer0716', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row8' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell3' },
                        React.createElement('input', { type: 'text', ref: 'answer0803', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement('td', { className: 'cell cell7' }),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell9' },
                        React.createElement('input', { type: 'text', ref: 'answer0809', placeholder: '6', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell10' },
                        React.createElement('input', { type: 'text', ref: 'answer0810', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer0811', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell12' },
                        React.createElement('input', { type: 'text', ref: 'answer0812', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell13' },
                        React.createElement('input', { type: 'text', ref: 'answer0813', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell14' },
                        React.createElement('input', { type: 'text', ref: 'answer0814', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell15' },
                        React.createElement('input', { type: 'text', ref: 'answer0815', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell16' },
                        React.createElement('input', { type: 'text', ref: 'answer0816', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell17' },
                        React.createElement('input', { type: 'text', ref: 'answer0817', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell18' },
                        React.createElement('input', { type: 'text', ref: 'answer0818', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row9' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell3' },
                        React.createElement('input', { type: 'text', ref: 'answer0903', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement('td', { className: 'cell cell7' }),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer0911', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement('td', { className: 'cell cell16' }),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row10' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell3' },
                        React.createElement('input', { type: 'text', ref: 'answer1003', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell5' },
                        React.createElement('input', { type: 'text', ref: 'answer1005', placeholder: '7', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell6' },
                        React.createElement('input', { type: 'text', ref: 'answer1006', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell7' },
                        React.createElement('input', { type: 'text', ref: 'answer1007', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell8' },
                        React.createElement('input', { type: 'text', ref: 'answer1008', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell9' },
                        React.createElement('input', { type: 'text', ref: 'answer1009', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell10' },
                        React.createElement('input', { type: 'text', ref: 'answer1010', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer1011', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement('td', { className: 'cell cell16' }),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row11' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell3' },
                        React.createElement('input', { type: 'text', ref: 'answer1103', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement('td', { className: 'cell cell7' }),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer1111', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement('td', { className: 'cell cell16' }),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row12' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell2' },
                        React.createElement('input', { type: 'text', ref: 'answer1202', placeholder: '8', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell3' },
                        React.createElement('input', { type: 'text', ref: 'answer1203', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell4' },
                        React.createElement('input', { type: 'text', ref: 'answer1204', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell5' },
                        React.createElement('input', { type: 'text', ref: 'answer1205', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell6' },
                        React.createElement('input', { type: 'text', ref: 'answer1206', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell7' },
                        React.createElement('input', { type: 'text', ref: 'answer1207', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell8' },
                        React.createElement('input', { type: 'text', ref: 'answer1208', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell9' },
                        React.createElement('input', { type: 'text', ref: 'answer1209', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell10' },
                        React.createElement('input', { type: 'text', ref: 'answer1210', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer1211', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement('td', { className: 'cell cell16' }),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row13' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell3' },
                        React.createElement('input', { type: 'text', ref: 'answer1303', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement('td', { className: 'cell cell7' }),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer1311', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement('td', { className: 'cell cell16' }),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row14' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement('td', { className: 'cell cell3' }),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement('td', { className: 'cell cell7' }),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer1411', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement('td', { className: 'cell cell16' }),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row15' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement('td', { className: 'cell cell3' }),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell7' },
                        React.createElement('input', { type: 'text', ref: 'answer1507', placeholder: '9', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer1511', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement('td', { className: 'cell cell16' }),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row16' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement('td', { className: 'cell cell3' }),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell7' },
                        React.createElement('input', { type: 'text', ref: 'answer1607', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer1611', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement('td', { className: 'cell cell16' }),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row17' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement('td', { className: 'cell cell3' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell4' },
                        React.createElement('input', { type: 'text', ref: 'answer1704', placeholder: '10', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell5' },
                        React.createElement('input', { type: 'text', ref: 'answer1705', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell6' },
                        React.createElement('input', { type: 'text', ref: 'answer1706', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell7' },
                        React.createElement('input', { type: 'text', ref: 'answer1707', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell8' },
                        React.createElement('input', { type: 'text', ref: 'answer1708', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell9' },
                        React.createElement('input', { type: 'text', ref: 'answer1709', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell10' },
                        React.createElement('input', { type: 'text', ref: 'answer1710', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer1711', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell12' },
                        React.createElement('input', { type: 'text', ref: 'answer1712', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement(
                        'td',
                        { className: 'cell cell13' },
                        React.createElement('input', { type: 'text', ref: 'answer1713', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement('td', { className: 'cell cell16' }),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row18' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement('td', { className: 'cell cell3' }),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell7' },
                        React.createElement('input', { type: 'text', ref: 'answer1807', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell11' },
                        React.createElement('input', { type: 'text', ref: 'answer1811', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement('td', { className: 'cell cell16' }),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row19' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement('td', { className: 'cell cell3' }),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell7' },
                        React.createElement('input', { type: 'text', ref: 'answer1907', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement('td', { className: 'cell cell11' }),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement('td', { className: 'cell cell16' }),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                ),
                React.createElement(
                    'tr',
                    { className: 'row20' },
                    React.createElement('td', { className: 'cell cell0' }),
                    React.createElement('td', { className: 'cell cell1' }),
                    React.createElement('td', { className: 'cell cell2' }),
                    React.createElement('td', { className: 'cell cell3' }),
                    React.createElement('td', { className: 'cell cell4' }),
                    React.createElement('td', { className: 'cell cell5' }),
                    React.createElement('td', { className: 'cell cell6' }),
                    React.createElement(
                        'td',
                        { className: 'cell cell7' },
                        React.createElement('input', { type: 'text', ref: 'answer2007', maxLength: '1', onChange: this.handleChange })
                    ),
                    React.createElement('td', { className: 'cell cell8' }),
                    React.createElement('td', { className: 'cell cell9' }),
                    React.createElement('td', { className: 'cell cell10' }),
                    React.createElement('td', { className: 'cell cell11' }),
                    React.createElement('td', { className: 'cell cell12' }),
                    React.createElement('td', { className: 'cell cell13' }),
                    React.createElement('td', { className: 'cell cell14' }),
                    React.createElement('td', { className: 'cell cell15' }),
                    React.createElement('td', { className: 'cell cell16' }),
                    React.createElement('td', { className: 'cell cell17' }),
                    React.createElement('td', { className: 'cell cell18' }),
                    React.createElement('td', { className: 'cell cell19' }),
                    React.createElement('td', { className: 'cell cell20' })
                )
            );
        }
    }]);

    return Article;
}(React.Component);

var Acomponent = function (_React$Component4) {
    _inherits(Acomponent, _React$Component4);

    function Acomponent() {
        _classCallCheck(this, Acomponent);

        return _possibleConstructorReturn(this, (Acomponent.__proto__ || Object.getPrototypeOf(Acomponent)).apply(this, arguments));
    }

    _createClass(Acomponent, [{
        key: 'render',
        value: function render() {
            var divStyle = {
                color: 'green',
                textAlign: 'center'
            };
            return React.createElement(
                'div',
                null,
                React.createElement(
                    'p',
                    { style: divStyle },
                    ' A simple react component with inline style'
                )
            );
        }
    }]);

    return Acomponent;
}(React.Component);

var Footer = function (_React$Component5) {
    _inherits(Footer, _React$Component5);

    function Footer() {
        _classCallCheck(this, Footer);

        return _possibleConstructorReturn(this, (Footer.__proto__ || Object.getPrototypeOf(Footer)).apply(this, arguments));
    }

    _createClass(Footer, [{
        key: 'render',
        value: function render() {
            return React.createElement(
                'footer',
                null,
                React.createElement(
                    'p',
                    null,
                    'Class of 2020'
                )
            );
        }
    }]);

    return Footer;
}(React.Component);

// Start Coding here

var App = function (_React$Component6) {
    _inherits(App, _React$Component6);

    function App(props) {
        _classCallCheck(this, App);

        var _this6 = _possibleConstructorReturn(this, (App.__proto__ || Object.getPrototypeOf(App)).call(this, props));

        _this6.state = {
            menu_items: ['Introduction', 'Basics', 'Javascript'],
            data: ['Pascaline', 'Difference engine', "MooresLaw", 'FuzzyLogic', 'Algorithm', 'TuringTest', 'Boolean', 'Vacuum tube', 'Abacus', 'Relational']
        };
        _this6.handleAddItem = _this6.handleAddItem.bind(_this6);
        return _this6;
    }

    _createClass(App, [{
        key: 'handleAddItem',
        value: function handleAddItem(event) {
            event.preventDefault();
            var new_item = event.target.elements.new_item.value.trim();

            if (!new_item) {
                alert('enter valid input');
            }
            this.setState(function (prevState, props) {
                return {
                    menu_items: prevState.menu_items.concat(new_item)
                };
            });
        }
    }, {
        key: 'render',
        value: function render() {
            return React.createElement(
                'div',
                null,
                React.createElement(Article, null)
            );
        }
    }]);

    return App;
}(React.Component);

ReactDOM.render(React.createElement(App, null), document.getElementById("app"));
