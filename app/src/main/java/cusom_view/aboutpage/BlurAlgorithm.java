package cusom_view.aboutpage;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;

public interface BlurAlgorithm {
    Bitmap blur(Bitmap bitmap, float blurRadius);

    void destroy();

    boolean canModifyBitmap();

    @NonNull
    Bitmap.Config getSupportedBitmapConfig();
}
