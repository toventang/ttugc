package com.facebook.p1814a.p1824i;

import android.os.Bundle;
import android.view.View;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.C24872m;
import com.facebook.GraphRequest;
import com.facebook.internal.C24693ad;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23973h;
import com.facebook.p1814a.C23998m;
import com.facebook.p1814a.p1816b.p1817a.C23888f;
import com.facebook.p1814a.p1821f.C23953c;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.i.f */
public final class View$OnClickListenerC23992f implements View.OnClickListener {

    /* renamed from: a */
    static final Set<Integer> f56786a = new HashSet();

    /* renamed from: b */
    private static final String f56787b = View$OnClickListenerC23992f.class.getCanonicalName();

    /* renamed from: c */
    private View.OnClickListener f56788c;

    /* renamed from: d */
    private WeakReference<View> f56789d;

    /* renamed from: e */
    private WeakReference<View> f56790e;

    /* renamed from: f */
    private String f56791f;

    static {
        Covode.recordClassIndex(28113);
    }

    /* renamed from: a */
    static /* synthetic */ String m45376a(View$OnClickListenerC23992f fVar) {
        if (C24677a.m47209a(View$OnClickListenerC23992f.class)) {
            return null;
        }
        try {
            return fVar.f56791f;
        } catch (Throwable th) {
            C24677a.m47208a(th, View$OnClickListenerC23992f.class);
            return null;
        }
    }

    public final void onClick(View view) {
        if (!C24677a.m47209a(this)) {
            try {
                View.OnClickListener onClickListener = this.f56788c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (!C24677a.m47209a(this)) {
                    try {
                        View view2 = this.f56789d.get();
                        View view3 = this.f56790e.get();
                        if (view2 != null && view3 != null) {
                            try {
                                final String b = C23987c.m45363b(view3);
                                final String a = C23986b.m45359a(view3, b);
                                if (a != null) {
                                    if (!m45378a(a, b)) {
                                        final JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("view", C23987c.m45362a(view2, view3));
                                        jSONObject.put("screenname", this.f56791f);
                                        if (!C24677a.m47209a(this)) {
                                            try {
                                                C24693ad.m47253a(new Runnable() {
                                                    /* class com.facebook.p1814a.p1824i.View$OnClickListenerC23992f.RunnableC239942 */

                                                    static {
                                                        Covode.recordClassIndex(28115);
                                                    }

                                                    public final void run() {
                                                        String[] a;
                                                        if (!C24677a.m47209a(this)) {
                                                            try {
                                                                C24699ae.m47299a();
                                                                String lowerCase = C24693ad.m47281e(C24872m.f59047g).toLowerCase();
                                                                float[] a2 = C23985a.m45355a(jSONObject, lowerCase);
                                                                String a3 = C23985a.m45346a(b, View$OnClickListenerC23992f.m45376a(View$OnClickListenerC23992f.this), lowerCase);
                                                                if (a2 != null && (a = C23953c.m45288a(C23953c.EnumC23958a.MTML_APP_EVENT_PREDICTION, new float[][]{a2}, new String[]{a3})) != null) {
                                                                    String str = a[0];
                                                                    String str2 = a;
                                                                    if (!C24677a.m47209a(C23986b.class)) {
                                                                        try {
                                                                            if (!C23986b.f56774c.get() && !C24677a.m47209a(C23986b.class)) {
                                                                                try {
                                                                                    if (!C23986b.f56774c.get()) {
                                                                                        C24699ae.m47299a();
                                                                                        C23986b.f56773b = C34822d.m71158a(C24872m.f59047g, "com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
                                                                                        C23986b.f56772a.putAll(C24693ad.m47282e(C23986b.f56773b.getString("SUGGESTED_EVENTS_HISTORY", "")));
                                                                                        C23986b.f56774c.set(true);
                                                                                    }
                                                                                } catch (Throwable th) {
                                                                                    C24677a.m47208a(th, C23986b.class);
                                                                                }
                                                                            }
                                                                            C23986b.f56772a.put(str2, str);
                                                                            C23986b.f56773b.edit().putString("SUGGESTED_EVENTS_HISTORY", C24693ad.m47238a(C23986b.f56772a)).apply();
                                                                        } catch (Throwable th2) {
                                                                            C24677a.m47208a(th2, C23986b.class);
                                                                        }
                                                                    }
                                                                    if (!str.equals("other")) {
                                                                        View$OnClickListenerC23992f.m45377a(str, b, a2);
                                                                    }
                                                                }
                                                            } catch (Exception unused) {
                                                            } catch (Throwable th3) {
                                                                C24677a.m47208a(th3, this);
                                                            }
                                                        }
                                                    }
                                                });
                                            } catch (Throwable th) {
                                                C24677a.m47208a(th, this);
                                            }
                                        }
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Throwable th2) {
                        C24677a.m47208a(th2, this);
                    }
                }
            } catch (Throwable th3) {
                C24677a.m47208a(th3, this);
            }
        }
    }

    /* renamed from: a */
    private static boolean m45378a(String str, final String str2) {
        if (C24677a.m47209a(View$OnClickListenerC23992f.class)) {
            return false;
        }
        try {
            final String a = C23986b.m45360a(str);
            if (a == null) {
                return false;
            }
            if (a.equals("other")) {
                return true;
            }
            C24693ad.m47253a(new Runnable() {
                /* class com.facebook.p1814a.p1824i.View$OnClickListenerC23992f.RunnableC239931 */

                static {
                    Covode.recordClassIndex(28114);
                }

                public final void run() {
                    if (!C24677a.m47209a(this)) {
                        try {
                            View$OnClickListenerC23992f.m45377a(a, str2, new float[0]);
                        } catch (Throwable th) {
                            C24677a.m47208a(th, this);
                        }
                    }
                }
            });
            return true;
        } catch (Throwable th) {
            C24677a.m47208a(th, View$OnClickListenerC23992f.class);
            return false;
        }
    }

    View$OnClickListenerC23992f(View view, View view2, String str) {
        this.f56788c = C23888f.m45165g(view);
        this.f56790e = new WeakReference<>(view);
        this.f56789d = new WeakReference<>(view2);
        this.f56791f = str.toLowerCase().replace("activity", "");
    }

    /* renamed from: a */
    static /* synthetic */ void m45377a(String str, String str2, float[] fArr) {
        if (!C24677a.m47209a(View$OnClickListenerC23992f.class)) {
            try {
                if (!C24677a.m47209a(View$OnClickListenerC23992f.class)) {
                    try {
                        if (C23988d.m45367a(str)) {
                            C24699ae.m47299a();
                            C23973h hVar = new C23998m(C24872m.f59047g).f56808a;
                            if (!C24677a.m47209a(hVar)) {
                                try {
                                    Bundle bundle = new Bundle();
                                    bundle.putString("_is_suggested_event", "1");
                                    bundle.putString("_button_text", str2);
                                    hVar.mo39460b();
                                } catch (Throwable th) {
                                    C24677a.m47208a(th, hVar);
                                }
                            }
                        } else if (C23988d.m45369b(str)) {
                            m45379b(str, str2, fArr);
                        }
                    } catch (Throwable th2) {
                        C24677a.m47208a(th2, View$OnClickListenerC23992f.class);
                    }
                }
            } catch (Throwable th3) {
                C24677a.m47208a(th3, View$OnClickListenerC23992f.class);
            }
        }
    }

    /* renamed from: b */
    private static void m45379b(String str, String str2, float[] fArr) {
        if (!C24677a.m47209a(View$OnClickListenerC23992f.class)) {
            try {
                Bundle bundle = new Bundle();
                try {
                    bundle.putString("event_name", str);
                    JSONObject jSONObject = new JSONObject();
                    StringBuilder sb = new StringBuilder();
                    for (float f : fArr) {
                        sb.append(f).append(",");
                    }
                    jSONObject.put("dense", sb.toString());
                    jSONObject.put("button_text", str2);
                    bundle.putString("metadata", jSONObject.toString());
                    Locale locale = Locale.US;
                    C24699ae.m47299a();
                    GraphRequest a = GraphRequest.m45067a((AccessToken) null, C1764a.m5929a(locale, "%s/suggested_events", new Object[]{C24872m.f59041a}), (JSONObject) null, (GraphRequest.AbstractC23858b) null);
                    a.f56459j = bundle;
                    GraphRequest.m45069a(a);
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, View$OnClickListenerC23992f.class);
            }
        }
    }
}
