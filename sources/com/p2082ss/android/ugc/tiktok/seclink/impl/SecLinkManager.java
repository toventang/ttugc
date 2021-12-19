package com.p2082ss.android.ugc.tiktok.seclink.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.retrofit2.AbstractC21983b;
import com.bytedance.retrofit2.AbstractC22030d;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21994b;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22012t;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.bytedance.webx.p1769i.C23629a;
import com.bytedance.webx.p1769i.p1770a.AbstractC23630a;
import com.bytedance.webx.p1769i.p1770a.AbstractC23637b;
import com.bytedance.webx.p1769i.p1770a.p1771a.C23633b;
import com.bytedance.webx.p1769i.p1773c.C23640a;
import com.bytedance.webx.p1769i.p1774d.C23643c;
import com.bytedance.webx.p1769i.p1775e.C23655d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.setting.services.ISettingService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.settings.C68731af;
import com.p2082ss.android.ugc.aweme.web.C81546h;
import com.p2082ss.android.ugc.tiktok.seclink.impl.p4332a.C84343e;
import com.p2082ss.android.ugc.tiktok.seclink.impl.p4332a.C84344f;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.tiktok.seclink.impl.SecLinkManager */
public final class SecLinkManager {

    /* renamed from: a */
    static Map<View, AbstractC23637b> f188571a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final SecLinkManager f188572b = new SecLinkManager();

    /* renamed from: com.ss.android.ugc.tiktok.seclink.impl.SecLinkManager$SecLinkDataApi */
    public interface SecLinkDataApi {
        static {
            Covode.recordClassIndex(98285);
        }

        @AbstractC22012t
        AbstractC21983b<String> executePost(@AbstractC21993ag String str, @AbstractC21994b TypedOutput typedOutput, @AbstractC22004l List<C22027b> list);
    }

    /* renamed from: com.ss.android.ugc.tiktok.seclink.impl.SecLinkManager$a */
    public static final class View$OnAttachStateChangeListenerC84337a implements View.OnAttachStateChangeListener {
        static {
            Covode.recordClassIndex(98286);
        }

        public final void onViewAttachedToWindow(View view) {
        }

        View$OnAttachStateChangeListenerC84337a() {
        }

        public final void onViewDetachedFromWindow(View view) {
            if (view != null) {
                view.removeOnAttachStateChangeListener(this);
            }
            Map<View, AbstractC23637b> map = SecLinkManager.f188571a;
            Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            C89206ad.m154686h(map).remove(view);
        }
    }

    private SecLinkManager() {
    }

    static {
        Covode.recordClassIndex(98282);
        Context a = C17867d.m33078a();
        String valueOf = String.valueOf(C17867d.f42590n);
        ISettingService v = SettingServiceImpl.m120782v();
        C89219l.m154716b(v, "");
        String a2 = v.mo108859a(v.mo108857a(C17867d.m33078a()).mo90019c());
        if (a == null) {
            throw new RuntimeException("context can not be null.");
        } else if (!TextUtils.isEmpty(valueOf)) {
            String str = "https://www.tiktok.com/link//";
            if (!TextUtils.isEmpty(str)) {
                Context applicationContext = a.getApplicationContext();
                if (C58003a.f132201c && applicationContext == null) {
                    applicationContext = C58003a.f132199a;
                }
                C23629a.f55912a = applicationContext;
                C23640a aVar = new C23640a();
                C23629a.f55913b = aVar;
                aVar.f55935a = valueOf;
                C23629a.f55913b.f55936b = a2;
                C23640a aVar2 = C23629a.f55913b;
                if (!TextUtils.isEmpty(str)) {
                    str = str.substring(0, 28);
                }
                aVar2.f55937c = str;
                C23629a.f55914c = true;
                m145075a(C81546h.m141419a(Collections.singletonList("host")));
                if (C84344f.m145090a().f188585a) {
                    C23640a aVar3 = C23629a.f55913b;
                    C89219l.m154716b(aVar3, "");
                    aVar3.f55939e = C84344f.m145090a().f188586b;
                    m145075a(C84343e.m145089a().f188580a);
                } else {
                    String[] a3 = C68731af.m121165a();
                    if (!(a3 == null || a3.length == 0)) {
                        m145075a(C89070n.m154522b(Arrays.copyOf(a3, a3.length)));
                    }
                }
                C23643c.f55944a = new AbstractC23630a() {
                    /* class com.p2082ss.android.ugc.tiktok.seclink.impl.SecLinkManager.C843351 */

                    static {
                        Covode.recordClassIndex(98283);
                    }

                    /* renamed from: com.ss.android.ugc.tiktok.seclink.impl.SecLinkManager$1$a */
                    public static final class C84336a implements AbstractC22030d<String> {

                        /* renamed from: a */
                        final /* synthetic */ AbstractC23630a.AbstractC23631a f188573a;

                        static {
                            Covode.recordClassIndex(98284);
                        }

                        C84336a(AbstractC23630a.AbstractC23631a aVar) {
                            this.f188573a = aVar;
                        }

                        @Override // com.bytedance.retrofit2.AbstractC22030d
                        /* renamed from: a */
                        public final void mo6817a(AbstractC21983b<String> bVar, C22099u<String> uVar) {
                            C89219l.m154721d(bVar, "");
                            C89219l.m154721d(uVar, "");
                            this.f188573a.mo39048a(uVar.f52262b);
                        }

                        @Override // com.bytedance.retrofit2.AbstractC22030d
                        /* renamed from: a */
                        public final void mo6818a(AbstractC21983b<String> bVar, Throwable th) {
                            C89219l.m154721d(bVar, "");
                            C89219l.m154721d(th, "");
                            this.f188573a.mo39049b(th.getMessage());
                        }
                    }

                    @Override // com.bytedance.webx.p1769i.p1770a.AbstractC23630a
                    /* renamed from: a */
                    public final String mo39046a(String str, JSONObject jSONObject) {
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(jSONObject, "");
                        if (TextUtils.isEmpty(str)) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new C22027b("Content-Type", "application/json"));
                        String jSONObject2 = jSONObject.toString();
                        C89219l.m154716b(jSONObject2, "");
                        Charset forName = Charset.forName("UTF-8");
                        C89219l.m154716b(forName, "");
                        Objects.requireNonNull(jSONObject2, "null cannot be cast to non-null type java.lang.String");
                        byte[] bytes = jSONObject2.getBytes(forName);
                        C89219l.m154716b(bytes, "");
                        return ((SecLinkDataApi) RetrofitUtils.m43281a("https://www.tiktok.com/link/", SecLinkDataApi.class)).executePost(str, new TypedByteArray(null, bytes, new String[0]), arrayList).execute().f52262b;
                    }

                    @Override // com.bytedance.webx.p1769i.p1770a.AbstractC23630a
                    /* renamed from: a */
                    public final void mo39047a(String str, JSONObject jSONObject, AbstractC23630a.AbstractC23631a aVar) {
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(jSONObject, "");
                        C89219l.m154721d(aVar, "");
                        if (!TextUtils.isEmpty(str)) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new C22027b("Content-Type", "application/json"));
                            String jSONObject2 = jSONObject.toString();
                            C89219l.m154716b(jSONObject2, "");
                            Charset forName = Charset.forName("UTF-8");
                            C89219l.m154716b(forName, "");
                            Objects.requireNonNull(jSONObject2, "null cannot be cast to non-null type java.lang.String");
                            byte[] bytes = jSONObject2.getBytes(forName);
                            C89219l.m154716b(bytes, "");
                            ((SecLinkDataApi) RetrofitUtils.m43281a("https://www.tiktok.com/link/", SecLinkDataApi.class)).executePost(str, new TypedByteArray(null, bytes, new String[0]), arrayList).enqueue(new C84336a(aVar));
                        }
                    }
                };
                return;
            }
            throw new RuntimeException("host can not be empty.");
        } else {
            throw new RuntimeException("aid can not be empty.");
        }
    }

    /* renamed from: a */
    private static void m145075a(List<String> list) {
        C23640a aVar = C23629a.f55913b;
        if (aVar.f55938d == null) {
            aVar.f55938d = new ArrayList();
        }
        aVar.f55938d.addAll(list);
    }

    /* renamed from: a */
    public static String m145072a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m145074a(WebView webView, String str) {
        C89219l.m154721d(webView, "");
        webView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC84337a());
        C23633b bVar = new C23633b(webView, str);
        bVar.mo39050a();
        Map<View, AbstractC23637b> map = f188571a;
        C89219l.m154716b(bVar, "");
        map.put(webView, bVar);
    }

    /* renamed from: a */
    public static String m145073a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || C23629a.f55913b == null || C23655d.m44729a(str)) {
            return str;
        }
        Uri parse = Uri.parse(str);
        C89219l.m154716b(parse, "");
        String host = parse.getHost();
        C23640a aVar = C23629a.f55913b;
        C89219l.m154716b(aVar, "");
        List<String> list = aVar.f55938d;
        if (list != null && (!list.isEmpty())) {
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                C89219l.m154716b(next, "");
                if (!TextUtils.isEmpty(host)) {
                    if (TextUtils.equals(host, next)) {
                        break;
                    }
                    if (host == null) {
                        C89219l.m154715b();
                    }
                    if (C89361p.m154876c(host, ".".concat(String.valueOf(next)), false)) {
                        break;
                    }
                }
            }
            if (TextUtils.equals("https", parse.getScheme())) {
                return str;
            }
        }
        return C23655d.m44728a(str, str2, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
        if (r8.length() != 0) goto L_0x00fd;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean m145076b(android.webkit.WebView r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 361
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tiktok.seclink.impl.SecLinkManager.m145076b(android.webkit.WebView, java.lang.String):java.lang.Boolean");
    }
}
