const path= require('path')
const htmlWebpackPlugin=require('html-webpack-plugin');
module.exports = {
    entry: './js/index.js',
    output: {
        path: path.resolve(__dirname, 'dist'),
        filename: 'bundle.js'
    },
  
    
};