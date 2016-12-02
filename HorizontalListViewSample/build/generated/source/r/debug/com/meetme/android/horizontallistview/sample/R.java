/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * aapt tool from the resource data it found.  It
 * should not be modified by hand.
 */

package com.meetme.android.horizontallistview.sample;

public final class R {
    public static final class attr {
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int dividerWidth=0x7f010000;
    }
    public static final class drawable {
        public static final int ic_launcher=0x7f020000;
    }
    public static final class id {
        public static final int hlvCustomList=0x7f070001;
        public static final int hlvCustomListWithDividerAndFadingEdge=0x7f070002;
        public static final int hlvSimpleList=0x7f070000;
        public static final int menu_settings=0x7f070004;
        public static final int textView=0x7f070003;
    }
    public static final class layout {
        public static final int activity_main=0x7f030000;
        public static final int custom_data_view=0x7f030001;
    }
    public static final class menu {
        public static final int activity_main=0x7f060000;
    }
    public static final class string {
        public static final int app_name=0x7f050000;
        public static final int custom_adapter_list=0x7f050001;
        public static final int custom_adapter_list_with_dividers=0x7f050002;
        public static final int hello_world=0x7f050003;
        public static final int menu_settings=0x7f050004;
        public static final int simple_string_list=0x7f050005;
    }
    public static final class style {
        /**  API 11 theme customizations can go here. 
 API 14 theme customizations can go here. 

            Theme customizations available in newer API levels can go in
            res/values-vXX/styles.xml, while customizations related to
            backward-compatibility can go here.
        
         */
        public static final int AppBaseTheme=0x7f040000;
        /**  All customizations that are NOT specific to a particular API-level can go here. 
         */
        public static final int AppTheme=0x7f040001;
    }
    public static final class styleable {
        /** Attributes that can be used with a HorizontalListView.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #HorizontalListView_android_divider android:divider}</code></td><td></td></tr>
           <tr><td><code>{@link #HorizontalListView_android_fadingEdgeLength android:fadingEdgeLength}</code></td><td></td></tr>
           <tr><td><code>{@link #HorizontalListView_android_requiresFadingEdge android:requiresFadingEdge}</code></td><td></td></tr>
           <tr><td><code>{@link #HorizontalListView_dividerWidth com.meetme.android.horizontallistview.sample:dividerWidth}</code></td><td></td></tr>
           </table>
           @see #HorizontalListView_android_divider
           @see #HorizontalListView_android_fadingEdgeLength
           @see #HorizontalListView_android_requiresFadingEdge
           @see #HorizontalListView_dividerWidth
         */
        public static final int[] HorizontalListView = {
            0x010100e0, 0x01010129, 0x010103a5, 0x7f010000
        };
        /**
          <p>This symbol is the offset where the {@link android.R.attr#divider}
          attribute's value can be found in the {@link #HorizontalListView} array.
          @attr name android:divider
        */
        public static final int HorizontalListView_android_divider = 1;
        /**
          <p>This symbol is the offset where the {@link android.R.attr#fadingEdgeLength}
          attribute's value can be found in the {@link #HorizontalListView} array.
          @attr name android:fadingEdgeLength
        */
        public static final int HorizontalListView_android_fadingEdgeLength = 0;
        /**
          <p>This symbol is the offset where the {@link android.R.attr#requiresFadingEdge}
          attribute's value can be found in the {@link #HorizontalListView} array.
          @attr name android:requiresFadingEdge
        */
        public static final int HorizontalListView_android_requiresFadingEdge = 2;
        /**
          <p>This symbol is the offset where the {@link com.meetme.android.horizontallistview.sample.R.attr#dividerWidth}
          attribute's value can be found in the {@link #HorizontalListView} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name com.meetme.android.horizontallistview.sample:dividerWidth
        */
        public static final int HorizontalListView_dividerWidth = 3;
    };
}
