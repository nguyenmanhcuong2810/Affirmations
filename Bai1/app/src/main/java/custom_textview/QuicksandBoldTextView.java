package custom_textview;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class QuicksandBoldTextView extends AppCompatTextView  {
    public QuicksandBoldTextView(Context context) {
        super(context);
        setFontsTextView();
    }

    public QuicksandBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setFontsTextView();
    }

    public QuicksandBoldTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setFontsTextView();
    }
    private void setFontsTextView() {
        Typeface typeface = Untils.getQuicksandBoldTypeface(getContext());
        setTypeface(typeface);
    }
}
