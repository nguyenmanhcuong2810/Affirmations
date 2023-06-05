package custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class MontserratExtraBoldltalicTextView extends AppCompatTextView  {
    public MontserratExtraBoldltalicTextView(Context context) {
        super(context);
        setFontsTextView();
    }

    public MontserratExtraBoldltalicTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }

    public MontserratExtraBoldltalicTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();
    }
    private void setFontsTextView() {
        Typeface typeface = Untils.getMontserratExtraBoldltalicTypeface(getContext());
        setTypeface(typeface);
    }
}
