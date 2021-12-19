package com.bytedance.android.livesdk.p442ai;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0792v;
import com.bytedance.android.live.p250i.p251a.AbstractC4354b;
import com.bytedance.android.live.p250i.p252b.C4360b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.p1206f.C17309b;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.bytedance.android.livesdk.ai.d */
public final class C6718d implements AbstractC4354b {

    /* renamed from: a */
    public static String f16658a;

    /* renamed from: b */
    public WeakReference<Activity> f16659b;

    /* renamed from: c */
    public WeakReference<ViewGroup> f16660c;

    /* renamed from: d */
    public WeakReference<AbstractC4354b.AbstractC4355a> f16661d;

    /* renamed from: com.bytedance.android.livesdk.ai.d$b */
    public static class C6721b implements GLSurfaceView.Renderer {
        static {
            Covode.recordClassIndex(7459);
        }

        public void onDrawFrame(GL10 gl10) {
        }

        public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        }
    }

    static {
        Covode.recordClassIndex(7456);
    }

    /* renamed from: com.bytedance.android.livesdk.ai.d$a */
    public static final class C6720a implements C4360b.AbstractC4362b<AbstractC4354b> {
        static {
            Covode.recordClassIndex(7458);
        }

        @Override // com.bytedance.android.live.p250i.p252b.C4360b.AbstractC4362b
        /* renamed from: a */
        public final C4360b.AbstractC4362b.C4363a<AbstractC4354b> mo10117a(C4360b.AbstractC4362b.C4363a<AbstractC4354b> aVar) {
            aVar.f11884a = (R) new C6718d();
            aVar.f11885b = true;
            return aVar;
        }
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4354b
    /* renamed from: a */
    public final String mo10104a(Context context) {
        String a;
        String str = f16658a;
        if (str != null) {
            return str;
        }
        if (!(context == null || (a = C17309b.m32048a(context, C17309b.f41588b).mo27620a("hardware_info_gpu_name", (String) null)) == null)) {
            f16658a = a;
        }
        return f16658a;
    }

    /* renamed from: a */
    public static void m14265a(AbstractC4354b.AbstractC4355a aVar, String str) {
        if (aVar != null) {
            aVar.mo8672a(str);
        }
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4354b
    /* renamed from: a */
    public final void mo10105a(Activity activity, View view, AbstractC4354b.AbstractC4355a aVar) {
        MethodCollector.m26663i(12554);
        String str = f16658a;
        if (str != null) {
            m14265a(aVar, str);
            MethodCollector.m26664o(12554);
        } else if (activity == null) {
            MethodCollector.m26664o(12554);
        } else {
            String a = mo10104a(activity);
            if (a != null) {
                m14265a(aVar, a);
                MethodCollector.m26664o(12554);
            } else if (!(view instanceof ViewGroup)) {
                MethodCollector.m26664o(12554);
            } else if (this.f16659b != null) {
                MethodCollector.m26664o(12554);
            } else {
                this.f16659b = new WeakReference<>(activity);
                ViewGroup viewGroup = (ViewGroup) view;
                this.f16660c = new WeakReference<>(viewGroup);
                this.f16661d = new WeakReference<>(aVar);
                final GLSurfaceView gLSurfaceView = new GLSurfaceView(activity);
                gLSurfaceView.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
                gLSurfaceView.setRenderer(new C6721b() {
                    /* class com.bytedance.android.livesdk.p442ai.C6718d.C67191 */

                    static {
                        Covode.recordClassIndex(7457);
                    }

                    @Override // com.bytedance.android.livesdk.p442ai.C6718d.C6721b
                    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
                        String str;
                        String glGetString = gl10.glGetString(7937);
                        String glGetString2 = gl10.glGetString(7936);
                        if (TextUtils.isEmpty(glGetString) || TextUtils.isEmpty(glGetString2)) {
                            str = null;
                        } else {
                            str = glGetString2 + " " + glGetString;
                        }
                        try {
                            if (C6718d.this.f16659b != null) {
                                Activity activity = C6718d.this.f16659b.get();
                                if (activity != null) {
                                    activity.runOnUiThread(new RunnableC6722e(this, str, activity, gLSurfaceView));
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        C6718d.this.f16659b = null;
                        C6718d.this.f16660c = null;
                        C6718d.this.f16661d = null;
                    }
                });
                gLSurfaceView.setId(C0792v.m2735a());
                viewGroup.addView(gLSurfaceView);
                MethodCollector.m26664o(12554);
            }
        }
    }
}
