# Using the Butter Knife Library

The Butter Knife library, developer and maintained by [Jake Wharton (Square Inc.)](https://github.com/JakeWharton), has annotations that help developers to instantiate the views from our activity or fragment. It also has annotations to handle events like onClick(), onLongClick(), etc.

In the sample project we'll explore the steps involved to integrate the Butter Knife library.

### Step 1: Add the Dependency

Add the following dependency to the project's build.gradle file:
```javascript
compile 'com.jakewharton:butterknife:7.0.1'
```

### Step 2: Use the Annotations
In every activity or fragment, you have to remove, or comment out, every call of the `findViewById()` method and add the `@Bind`  annotation before the declaration of the variable, indicating the identifier of the view.

```javascript
    @Bind(R.id.textview)
    TextView textView;
```

### Step 3: Inject Views
In the onCreate() method of the activity, before using any the views, call `bind` on the Butterknife object.
```javascript
   ButterKnife.bind(this);
```
The `@OnClick(R.id.button)` annotation allows to add OnClickListener to a view. 
```javascript
  @OnClick(R.id.button)
  public void submit() {
    Toast.makeText(MainActivity.this, "Hello from Butterknife OnClick annotation", Toast.LENGTH_LONG).show();
  }
```
### Step 4: Validate setup
Run your application and ensure that the TextView got injected and the button event is fired, if you click the button.

### Conclusion

You can use Butter Knife `bind()` method anywhere you would otherwise use the findViewById() method to save time and avoid code repetition when you have to instantiate the views in the layout. Feel free to share this quick-tip if you found it helpful.
