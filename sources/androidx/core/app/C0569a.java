package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.app.AbstractC0618p;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.core.app.a */
public final class C0569a extends C0643b {

    /* renamed from: a */
    public static AbstractC0572b f2447a;

    /* renamed from: androidx.core.app.a$a */
    public interface AbstractC0571a {
        static {
            Covode.recordClassIndex(649);
        }

        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* renamed from: androidx.core.app.a$b */
    public interface AbstractC0572b {
        static {
            Covode.recordClassIndex(650);
        }

        /* renamed from: a */
        boolean mo2553a();

        /* renamed from: b */
        boolean mo2554b();
    }

    /* renamed from: androidx.core.app.a$c */
    public interface AbstractC0573c {
        static {
            Covode.recordClassIndex(651);
        }

        void validateRequestPermissionsRequestCode(int i);
    }

    static {
        Covode.recordClassIndex(647);
    }

    /* renamed from: androidx.core.app.a$d */
    public static class SharedElementCallbackC0574d extends SharedElementCallback {

        /* renamed from: a */
        private final AbstractC0618p f2451a;

        static {
            Covode.recordClassIndex(652);
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
        }

        @Override // android.app.SharedElementCallback
        public final void onRejectSharedElements(List<View> list) {
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        }

        public SharedElementCallbackC0574d(AbstractC0618p pVar) {
            this.f2451a = pVar;
        }

        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
                if (bitmap == null) {
                    return null;
                }
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap(bitmap);
                imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
                if (imageView.getScaleType() != ImageView.ScaleType.MATRIX) {
                    return imageView;
                }
                float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView.setImageMatrix(matrix);
                return imageView;
            } else if (!(parcelable instanceof Bitmap)) {
                return null;
            } else {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageBitmap((Bitmap) parcelable);
                return imageView2;
            }
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            new AbstractC0618p.AbstractC0619a() {
                /* class androidx.core.app.C0569a.SharedElementCallbackC0574d.C05751 */

                static {
                    Covode.recordClassIndex(653);
                }

                @Override // androidx.core.app.AbstractC0618p.AbstractC0619a
                /* renamed from: a */
                public final void mo2563a() {
                    onSharedElementsReadyListener.onSharedElementsReady();
                }
            }.mo2563a();
        }

        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Bitmap createBitmap;
            AbstractC0618p pVar = this.f2451a;
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (drawable != null && background == null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        float min = Math.min(1.0f, 1048576.0f / ((float) (intrinsicWidth * intrinsicHeight)));
                        if (!(drawable instanceof BitmapDrawable) || min != 1.0f) {
                            int i = (int) (((float) intrinsicWidth) * min);
                            int i2 = (int) (((float) intrinsicHeight) * min);
                            createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Rect bounds = drawable.getBounds();
                            int i3 = bounds.left;
                            int i4 = bounds.top;
                            int i5 = bounds.right;
                            int i6 = bounds.bottom;
                            drawable.setBounds(0, 0, i, i2);
                            drawable.draw(canvas);
                            drawable.setBounds(i3, i4, i5, i6);
                        } else {
                            createBitmap = ((BitmapDrawable) drawable).getBitmap();
                        }
                        if (createBitmap != null) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("sharedElement:snapshot:bitmap", createBitmap);
                            bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                            if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                                float[] fArr = new float[9];
                                imageView.getImageMatrix().getValues(fArr);
                                bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                            }
                            return bundle;
                        }
                    }
                }
            }
            int round = Math.round(rectF.width());
            int round2 = Math.round(rectF.height());
            if (round <= 0 || round2 <= 0) {
                return null;
            }
            float min2 = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
            int i7 = (int) (((float) round) * min2);
            int i8 = (int) (((float) round2) * min2);
            if (pVar.f2617a == null) {
                pVar.f2617a = new Matrix();
            }
            pVar.f2617a.set(matrix);
            pVar.f2617a.postTranslate(-rectF.left, -rectF.top);
            pVar.f2617a.postScale(min2, min2);
            Bitmap createBitmap2 = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.concat(pVar.f2617a);
            view.draw(canvas2);
            return createBitmap2;
        }
    }

    /* renamed from: a */
    public static void m2179a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    /* renamed from: b */
    public static void m2184b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    /* renamed from: c */
    public static void m2185c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    /* renamed from: a */
    public static boolean m2183a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    /* renamed from: a */
    public static void m2182a(final Activity activity, final String[] strArr, final int i) {
        AbstractC0572b bVar = f2447a;
        if (bVar != null && bVar.mo2553a()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof AbstractC0573c) {
                ((AbstractC0573c) activity).validateRequestPermissionsRequestCode(i);
            }
            if (!((Boolean) C15346a.m28238a(activity, new Object[]{strArr, Integer.valueOf(i)}, 102600, "void", false, null).first).booleanValue()) {
                C15346a.m28240a(null, activity, new Object[]{strArr, Integer.valueOf(i)}, 102600, "androidx_core_app_ActivityCompat_android_app_Activity_requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V");
                activity.requestPermissions(strArr, i);
            }
        } else if (activity instanceof AbstractC0571a) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class androidx.core.app.C0569a.RunnableC05701 */

                static {
                    Covode.recordClassIndex(648);
                }

                public final void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i = 0; i < length; i++) {
                        iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                    }
                    ((AbstractC0571a) activity).onRequestPermissionsResult(i, strArr, iArr);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m2180a(Activity activity, Intent intent, int i, Bundle bundle) {
        int i2 = Build.VERSION.SDK_INT;
        activity.startActivityForResult(intent, i, bundle);
    }

    /* renamed from: a */
    public static void m2181a(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        int i5 = Build.VERSION.SDK_INT;
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
