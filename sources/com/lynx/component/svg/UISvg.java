package com.lynx.component.svg;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.component.svg.C28321d;
import com.lynx.component.svg.p2042a.C28256e;
import com.lynx.component.svg.p2042a.C28257f;
import com.lynx.component.svg.p2042a.C28310h;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.behavior.p2052ui.image.C28621a;
import com.lynx.tasm.core.C28745a;
import com.lynx.tasm.core.C28748b;
import com.lynx.tasm.provider.AbstractC28846d;
import com.lynx.tasm.provider.C28847e;
import com.lynx.tasm.provider.C28848f;
import com.lynx.tasm.utils.C28927k;
import com.lynx.tasm.utils.C28929m;

public class UISvg extends LynxUI<C28318b> {

    /* renamed from: a */
    public C28321d f66207a;

    /* renamed from: b */
    public C28256e f66208b;

    /* renamed from: c */
    public C28257f f66209c;

    /* renamed from: d */
    private String f66210d;

    /* renamed from: e */
    private String f66211e;

    static {
        Covode.recordClassIndex(34199);
    }

    /* renamed from: a */
    private void m56425a() {
        C28929m.m57947a(new Runnable() {
            /* class com.lynx.component.svg.UISvg.RunnableC282474 */

            static {
                Covode.recordClassIndex(34205);
            }

            public final void run() {
                if (UISvg.this.f66209c != null) {
                    ((C28318b) UISvg.this.mView).setImageDrawable(new C28248a(UISvg.this.f66209c, UISvg.this.f66208b, UISvg.this.f66207a));
                    UISvg.this.invalidate();
                }
            }
        });
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        for (Bitmap bitmap : this.f66207a.f66521b) {
            try {
                bitmap.recycle();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.f66208b.mo48327a((float) getWidth(), (float) getHeight());
        if (this.f66209c != null) {
            m56425a();
        }
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ C28318b createView(Context context) {
        return new C28318b(context);
    }

    public UISvg(AbstractC28520j jVar) {
        super(jVar);
        this.f66208b = new C28256e(jVar.f67068i.mFontSize);
        this.f66207a = new C28321d(jVar);
    }

    /* renamed from: a */
    public final void mo48313a(final C28257f fVar) {
        C28929m.m57947a(new Runnable() {
            /* class com.lynx.component.svg.UISvg.RunnableC282463 */

            static {
                Covode.recordClassIndex(34204);
            }

            public final void run() {
                UISvg.this.f66209c = fVar;
                ((C28318b) UISvg.this.mView).setImageDrawable(new C28248a(fVar, UISvg.this.f66208b, UISvg.this.f66207a));
                UISvg.this.invalidate();
            }
        });
    }

    @AbstractC28525m(mo49059a = "content")
    public void setContent(final String str) {
        if (TextUtils.isEmpty(str)) {
            ((C28318b) this.mView).setImageDrawable(null);
        } else if (!str.equals(this.f66211e)) {
            this.f66211e = str;
            C28745a.m57564a().execute(new Runnable() {
                /* class com.lynx.component.svg.UISvg.RunnableC282452 */

                static {
                    Covode.recordClassIndex(34203);
                }

                public final void run() {
                    try {
                        UISvg.this.mo48313a(C28257f.m56435a(str));
                    } catch (C28310h e) {
                        LLog.m56856a(6, "lynx_UISvg", e.toString());
                    }
                }
            });
        }
    }

    @AbstractC28525m(mo49059a = "src")
    public void setSource(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f66210d = null;
            ((C28318b) this.mView).setImageDrawable(null);
        } else if (!str.equals(this.f66210d)) {
            this.f66210d = str;
            C28321d dVar = this.f66207a;
            C282441 r4 = new C28321d.AbstractC28327c() {
                /* class com.lynx.component.svg.UISvg.C282441 */

                static {
                    Covode.recordClassIndex(34202);
                }

                @Override // com.lynx.component.svg.C28321d.AbstractC28327c
                /* renamed from: a */
                public final void mo48317a(C28257f fVar) {
                    UISvg.this.mo48313a(fVar);
                }

                @Override // com.lynx.component.svg.C28321d.AbstractC28327c
                /* renamed from: a */
                public final void mo48318a(String str) {
                    LLog.m56856a(6, "lynx_UISvg", str);
                }
            };
            if (dVar.f66522c == null) {
                String a = C28621a.m57207a(dVar.f66520a, str);
                if (TextUtils.isEmpty(a)) {
                    r4.mo48318a("url is empty!");
                } else if (TextUtils.isEmpty(Uri.parse(a).getScheme())) {
                    r4.mo48318a("scheme is Empty!");
                } else {
                    C28748b.m57567a().mo49866a(new C28847e(a), new AbstractC28846d(a, r4) {
                        /* class com.lynx.component.svg.C28321d.C283232 */

                        /* renamed from: a */
                        final /* synthetic */ String f66527a;

                        /* renamed from: b */
                        final /* synthetic */ AbstractC28327c f66528b;

                        static {
                            Covode.recordClassIndex(34281);
                        }

                        @Override // com.lynx.tasm.provider.AbstractC28846d
                        public final void onFailed(C28848f fVar) {
                            this.f66528b.mo48318a(fVar.f68093b);
                        }

                        @Override // com.lynx.tasm.provider.AbstractC28846d
                        public final void onSuccess(C28848f fVar) {
                            C28257f a;
                            try {
                                String a2 = C28927k.m57941a(fVar.f68095d);
                                if (TextUtils.isEmpty(a2)) {
                                    fVar.f68093b = "data is empty!";
                                    onFailed(fVar);
                                    return;
                                }
                                if (this.f66527a.startsWith("res:///")) {
                                    Application application = LynxEnv.m56706b().f66634a;
                                    a = C28257f.m56434a(application.getResources(), Integer.parseInt(a2));
                                } else {
                                    a = C28257f.m56435a(a2);
                                }
                                this.f66528b.mo48317a(a);
                            } catch (C28310h e) {
                                fVar.f68093b = e.toString();
                                new RuntimeException(e);
                            }
                        }

                        {
                            this.f66527a = r2;
                            this.f66528b = r3;
                        }
                    });
                }
            } else {
                new Object(r4) {
                    /* class com.lynx.component.svg.C28321d.C283243 */

                    /* renamed from: a */
                    final /* synthetic */ AbstractC28327c f66530a;

                    static {
                        Covode.recordClassIndex(34282);
                    }

                    {
                        this.f66530a = r2;
                    }
                };
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, rect);
        this.f66208b.mo48327a((float) getWidth(), (float) getHeight());
        if (this.f66209c != null) {
            m56425a();
        }
    }
}
