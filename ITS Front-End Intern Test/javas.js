fetch("https://makeup-api.herokuapp.com/api/v1/products.json?brand=maybelline", {
  "method": "GET", 
  "Content-Type": "applications/json"
}).then(res => {
  return res.json();
  // console.log(res.json());
}).then(data => {
  console.log(data)
});