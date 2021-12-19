package com.p2082ss.android.ugc.aweme.lancet;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.lancet.l */
public final /* synthetic */ class RunnableC58031l implements Runnable {

    /* renamed from: a */
    private final WeakReference f132262a;

    /* renamed from: b */
    private final Activity f132263b;

    /* renamed from: c */
    private final ImageView f132264c;

    static {
        Covode.recordClassIndex(68066);
    }

    RunnableC58031l(WeakReference weakReference, Activity activity, ImageView imageView) {
        this.f132262a = weakReference;
        this.f132263b = activity;
        this.f132264c = imageView;
    }

    public final void run() {
        WeakReference weakReference = this.f132262a;
        Activity activity = this.f132263b;
        ImageView imageView = this.f132264c;
        try {
            ImageView imageView2 = (ImageView) weakReference.get();
            if (imageView2 != null && imageView2.getDrawable() != null && !C0792v.m2791y(imageView2)) {
                StringBuffer stringBuffer = new StringBuffer("activity " + activity + " image " + imageView);
                stringBuffer.append(" leak!!!, image drawable is " + imageView.getDrawable());
                stringBuffer.append(", image background is " + imageView.getBackground());
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    drawable.setCallback(null);
                }
                imageView.setImageDrawable(null);
                if (imageView.getBackground() != null) {
                    try {
                        imageView.getBackground().setCallback(null);
                        imageView.setBackgroundDrawable(null);
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
