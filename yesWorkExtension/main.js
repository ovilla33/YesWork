chrome.app.runtime.onLaunched.addListener(function() {
  chrome.app.window.create('index.html', {
      id: "mainwin",
      "bounds": { "width": 300, "height": 300 }
  });
});
