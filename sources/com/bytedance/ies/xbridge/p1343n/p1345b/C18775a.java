package com.bytedance.ies.xbridge.p1343n.p1345b;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.model.p1342c.C18745b;
import com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18755a;
import com.bytedance.ies.xbridge.p1343n.p1348d.C18788a;
import com.bytedance.ies.xbridge.p1349o.C18806a;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Locale;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.n.b.a */
public final class C18775a extends AbstractC18755a {

    /* renamed from: a */
    private final String f44554a = "XConfigureStatusBarMethod";

    /* renamed from: com.bytedance.ies.xbridge.n.b.a$a */
    public enum EnumC18776a {
        DARK("dark"),
        LIGHT("light"),
        UNKNOWN(null);
        
        public static final C18777a Companion = new C18777a((byte) 0);

        /* renamed from: b */
        private final String f44556b;

        /* renamed from: com.bytedance.ies.xbridge.n.b.a$a$a */
        public static final class C18777a {
            static {
                Covode.recordClassIndex(21473);
            }

            private C18777a() {
            }

            public /* synthetic */ C18777a(byte b) {
                this();
            }

            /* renamed from: a */
            public static EnumC18776a m34892a(String str) {
                if (str == null) {
                    return EnumC18776a.UNKNOWN;
                }
                try {
                    Locale locale = Locale.US;
                    C89219l.m154709a((Object) locale, "");
                    String upperCase = str.toUpperCase(locale);
                    C89219l.m154709a((Object) upperCase, "");
                    return EnumC18776a.valueOf(upperCase);
                } catch (Throwable unused) {
                    return EnumC18776a.UNKNOWN;
                }
            }
        }

        public final String getStyle() {
            return this.f44556b;
        }

        static {
            Covode.recordClassIndex(21472);
        }

        private EnumC18776a(String str) {
            this.f44556b = str;
        }
    }

    static {
        Covode.recordClassIndex(21471);
    }

    @Override // com.bytedance.ies.xbridge.p1343n.p1344a.AbstractC18755a
    /* renamed from: a */
    public final void mo29798a(C18788a aVar, AbstractC18755a.AbstractC18756a aVar2, EnumC18483e eVar) {
        Window window;
        boolean z;
        Window window2;
        MethodCollector.m26663i(8723);
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(eVar, "");
        Context context = (Context) mo29616a(Context.class);
        if (context == null) {
            aVar2.mo29799a(0, "Context not provided in host");
            MethodCollector.m26664o(8723);
            return;
        }
        Activity a = C18806a.m34902a(context);
        String str = aVar.f44562a;
        Boolean bool = aVar.f44564c;
        try {
            EnumC18776a a2 = EnumC18776a.C18777a.m34892a(str);
            if (a2 == EnumC18776a.UNKNOWN) {
                aVar2.mo29799a(-3, "StatusBar style can only be dark or light,  style: ".concat(String.valueOf(a2)));
                MethodCollector.m26664o(8723);
                return;
            }
            if (a != null) {
                window = a.getWindow();
            } else {
                window = null;
            }
            if (a2 == EnumC18776a.DARK) {
                z = true;
            } else {
                z = false;
            }
            if (!(a == null || window == null)) {
                try {
                    if (Build.VERSION.SDK_INT >= 23) {
                        View decorView = window.getDecorView();
                        C89219l.m154709a((Object) decorView, "");
                        int systemUiVisibility = decorView.getSystemUiVisibility();
                        if (!z) {
                            decorView.setSystemUiVisibility(systemUiVisibility & -8193);
                        } else {
                            decorView.setSystemUiVisibility(systemUiVisibility | 8192);
                        }
                        window.clearFlags(67108864);
                        window.addFlags(Integer.MIN_VALUE);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (bool == null) {
                C89219l.m154707a();
            }
            if (bool.booleanValue()) {
                if (!(a == null || (window2 = a.getWindow()) == null)) {
                    window2.clearFlags(1024);
                }
            } else if (a != null) {
                a.getWindow().setFlags(1024, 1024);
                try {
                    Context applicationContext = a.getApplicationContext();
                    if (C58003a.f132201c) {
                        if (applicationContext == null) {
                            applicationContext = C58003a.f132199a;
                        }
                    }
                    C89219l.m154709a((Object) applicationContext, "");
                    Class<?> loadClass = applicationContext.getClassLoader().loadClass("android.os.SystemProperties");
                    Object invoke = loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, "ro.miui.notch", 0);
                    if (invoke == null) {
                        C89388w wVar = new C89388w("null cannot be cast to non-null type");
                        MethodCollector.m26664o(8723);
                        throw wVar;
                    } else if (((Integer) invoke).intValue() == 1 && Build.VERSION.SDK_INT < 28) {
                        try {
                            Window.class.getMethod("addExtraFlags", Integer.TYPE).invoke(a.getWindow(), 768);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
            String str2 = aVar.f44563b;
            if (!(a == null || str2 == null || str2.length() == 0 || str2.length() != 9)) {
                String substring = str2.substring(7, 9);
                C89219l.m154709a((Object) substring, "");
                if (substring != null) {
                    String upperCase = substring.toUpperCase();
                    C89219l.m154709a((Object) upperCase, "");
                    StringBuilder append = new StringBuilder().append("#".concat(String.valueOf(upperCase)));
                    String obj = str2.subSequence(1, 7).toString();
                    if (obj != null) {
                        String upperCase2 = obj.toUpperCase();
                        C89219l.m154709a((Object) upperCase2, "");
                        int parseColor = Color.parseColor(append.append(upperCase2).toString());
                        C89219l.m154719c(a, "");
                        int i = Build.VERSION.SDK_INT;
                        a.getWindow().addFlags(67108864);
                        View view = new View(a);
                        C89219l.m154719c(a, "");
                        view.setLayoutParams(new LinearLayout.LayoutParams(-1, a.getResources().getDimensionPixelSize(a.getResources().getIdentifier("status_bar_height", "dimen", "android"))));
                        view.setBackgroundColor(parseColor);
                        Window window3 = a.getWindow();
                        C89219l.m154709a((Object) window3, "");
                        View decorView2 = window3.getDecorView();
                        if (decorView2 != null) {
                            ((ViewGroup) decorView2).addView(view);
                            View findViewById = a.findViewById(R.id.acq);
                            if (findViewById != null) {
                                ViewGroup viewGroup = (ViewGroup) findViewById;
                                View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                                if (childAt != null) {
                                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                                    viewGroup2.setFitsSystemWindows(true);
                                    viewGroup2.setClipToPadding(true);
                                } else {
                                    C89388w wVar2 = new C89388w("null cannot be cast to non-null type");
                                    MethodCollector.m26664o(8723);
                                    throw wVar2;
                                }
                            } else {
                                C89388w wVar3 = new C89388w("null cannot be cast to non-null type");
                                MethodCollector.m26664o(8723);
                                throw wVar3;
                            }
                        } else {
                            C89388w wVar4 = new C89388w("null cannot be cast to non-null type");
                            MethodCollector.m26664o(8723);
                            throw wVar4;
                        }
                    } else {
                        C89388w wVar5 = new C89388w("null cannot be cast to non-null type");
                        MethodCollector.m26664o(8723);
                        throw wVar5;
                    }
                } else {
                    C89388w wVar6 = new C89388w("null cannot be cast to non-null type");
                    MethodCollector.m26664o(8723);
                    throw wVar6;
                }
            }
            aVar2.mo29800a(new C18745b(), "");
            MethodCollector.m26664o(8723);
        } catch (Exception e4) {
            e4.getMessage();
        }
    }
}
