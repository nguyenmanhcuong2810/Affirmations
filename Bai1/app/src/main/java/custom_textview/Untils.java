package custom_textview;

import android.content.Context;
import android.graphics.Typeface;

public class Untils {
    private static Typeface MontserratExtraBoldltalicTypeface;
    private static Typeface QuicksandBoldTypeface;

    public static Typeface getMontserratExtraBoldltalicTypeface(Context context) {
        if(MontserratExtraBoldltalicTypeface == null) {
            MontserratExtraBoldltalicTypeface = Typeface.createFromAsset(context.getAssets(),"fonts/Montserrat-ExtraBoldItalic.otf");
        }
        return MontserratExtraBoldltalicTypeface;

    }

    public static Typeface getQuicksandBoldTypeface(Context context) {
        if(QuicksandBoldTypeface == null) {
            QuicksandBoldTypeface = Typeface.createFromAsset(context.getAssets(),"fonts/Quicksand-Bold.otf");
        }
        return QuicksandBoldTypeface;
    }
}
