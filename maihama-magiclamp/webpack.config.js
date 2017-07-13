const webpack = require('webpack');

module.exports = {
  entry: {
    vendor: [
      'riot',
      'riot-route',
      'superagent',
    ],
    app: './src/javascripts/index.js',
  },
  output: {
    path: __dirname + '/dist/',
    filename: '[name].bundle.js'
  },
  module: {
    rules: [
      {
        test: /\.tag$/,
        exclude: /node_modules/,
        use: 'riot-tag-loader',
        enforce: 'pre' // or 'post'
      },
      {
        test: /\.js$|\.tag$/,
        exclude: /node_modules/,
        use: {
          loader: 'babel-loader',
          options: {
            presets: ['es2015', 'es2015-riot']
          }
        }
      },
      {
        test: /\.css$/,
        use: ['style-loader', 'css-loader']
      },
      {
        test: /\.js$/,
        exclude: /node_modules/,
        use: {
          loader: 'eslint-loader',
          options: {
            fix: true,
            failOnError: true,
          }
        },
      }
    ]
  },
  resolve: {
    extensions: ['.js', '.tag']
  },
  watch: true,
  devtool: 'source-map',
  plugins: [
    new webpack.ProvidePlugin({
      riot: 'riot',
      sa: 'superagent'
    }),
    new webpack.optimize.CommonsChunkPlugin({
      name: 'vendor',
      chunks: ['app']
    })
  ]
};