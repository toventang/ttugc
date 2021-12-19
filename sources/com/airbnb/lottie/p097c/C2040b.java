package com.airbnb.lottie.p097c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.DisplayMetrics;
import com.airbnb.lottie.C2122g;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.p104g.C2144d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.airbnb.lottie.c.b */
public final class C2040b {

    /* renamed from: a */
    public static final ConcurrentHashMap<Integer, LinkedBlockingQueue<Bitmap>> f6118a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static final C2040b f6119b = new C2040b();

    private C2040b() {
    }

    static {
        Covode.recordClassIndex(2235);
    }

    /* renamed from: a */
    public static Bitmap m6459a(C2122g gVar) {
        Bitmap poll;
        MethodCollector.m26663i(13350);
        C89219l.m154719c(gVar, "");
        LinkedBlockingQueue<Bitmap> linkedBlockingQueue = f6118a.get(Integer.valueOf(gVar.hashCode()));
        if (linkedBlockingQueue != null) {
            synchronized (linkedBlockingQueue) {
                try {
                    poll = linkedBlockingQueue.poll();
                } finally {
                    MethodCollector.m26664o(13350);
                }
            }
            return poll;
        }
        MethodCollector.m26664o(13350);
        return null;
    }

    /* renamed from: a */
    public static boolean m6460a(C2122g gVar, DisplayMetrics displayMetrics) {
        MethodCollector.m26663i(13433);
        C89219l.m154719c(gVar, "");
        C89219l.m154719c(displayMetrics, "");
        Bitmap a = C2039a.m6457a(gVar, Bitmap.Config.ARGB_8888, displayMetrics);
        int hashCode = gVar.hashCode();
        ConcurrentHashMap<Integer, LinkedBlockingQueue<Bitmap>> concurrentHashMap = f6118a;
        if (concurrentHashMap.get(Integer.valueOf(hashCode)) == null) {
            concurrentHashMap.put(Integer.valueOf(hashCode), new LinkedBlockingQueue<>());
        }
        if (a != null) {
            LottieAnimationView n = gVar.mo6039n();
            if (n != null) {
                try {
                    Canvas canvas = new Canvas(a);
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    if (n.getBackground() != null) {
                        n.getBackground().setBounds(0, 0, a.getWidth(), a.getHeight());
                        if ((n.getScrollX() | n.getScrollY()) == 0) {
                            n.getBackground().draw(canvas);
                        } else {
                            canvas.translate((float) n.getScrollX(), (float) n.getScrollY());
                            n.getBackground().draw(canvas);
                            canvas.translate(-((float) n.getScrollX()), -((float) n.getScrollY()));
                        }
                    }
                    if (n.getImageMatrix() == null && n.getPaddingTop() == 0 && n.getPaddingLeft() == 0) {
                        gVar.mo6008a(canvas);
                    } else {
                        int saveCount = canvas.getSaveCount();
                        canvas.save();
                        if (n.getCropToPadding()) {
                            canvas.clipRect(n.getScrollX() + n.getPaddingLeft(), n.getScrollY() + n.getPaddingTop(), ((n.getScrollX() + n.getRight()) - n.getLeft()) - n.getPaddingRight(), ((n.getScrollY() + n.getBottom()) - n.getTop()) - n.getPaddingBottom());
                        }
                        canvas.translate((float) n.getPaddingLeft(), (float) n.getPaddingTop());
                        if (n.getImageMatrix() != null) {
                            canvas.concat(n.getImageMatrix());
                        }
                        gVar.mo6008a(canvas);
                        canvas.restoreToCount(saveCount);
                    }
                    LinkedBlockingQueue<Bitmap> linkedBlockingQueue = concurrentHashMap.get(Integer.valueOf(hashCode));
                    if (linkedBlockingQueue != null) {
                        synchronized (linkedBlockingQueue) {
                            try {
                                linkedBlockingQueue.add(a);
                            } catch (Throwable th) {
                                MethodCollector.m26664o(13433);
                                throw th;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            C2144d.m6685e(gVar);
            MethodCollector.m26664o(13433);
            return true;
        }
        MethodCollector.m26664o(13433);
        return false;
    }
}
