package com.p2082ss.android.ugc.aweme.video.simcommon.p4218a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34852c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.simkit.model.bitrateselect.C74680b;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81962a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.video.simcommon.a.e */
public final class C80950e implements AbstractC34852c {

    /* renamed from: a */
    public static final C80950e f180987a = new C80950e();

    /* renamed from: b */
    private static Map<String, C74680b> f180988b;

    /* renamed from: c */
    private static Map<String, ? extends C74680b> f180989c;

    /* renamed from: d */
    private static IAwemeService f180990d;

    private C80950e() {
    }

    static {
        Covode.recordClassIndex(94256);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: java.util.Map<java.lang.String, com.ss.android.ugc.aweme.simkit.model.bitrateselect.b> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m140493a() {
        Map<String, C74680b> map;
        Map<String, ? extends C74680b> map2;
        Map<String, C74680b> map3;
        if (f180988b == null) {
            C80943a a = C80944b.m140479a();
            if (a == null || (map = a.f180977a) == null) {
                map = new HashMap<>();
            }
            f180988b = map;
            C80943a a2 = C80944b.m140479a();
            if (a2 == null || (map2 = a2.f180978b) == null) {
                map2 = new HashMap<>();
            }
            f180989c = map2;
            Set<String> keySet = map2.keySet();
            if (keySet != null) {
                for (T t : keySet) {
                    for (String str : C89361p.m154921c(t, new String[]{","})) {
                        Map<String, ? extends C74680b> map4 = f180989c;
                        if (map4 == null) {
                            C89219l.m154715b();
                        }
                        Object obj = map4.get(t);
                        if (!(TextUtils.isEmpty(str) || obj == null || (map3 = f180988b) == 0)) {
                            map3.put(str, obj);
                        }
                    }
                }
            }
            f180990d = AwemeService.m70060b();
        }
    }

    /* renamed from: b */
    private static AbstractC81962a m140494b(String str) {
        String str2;
        Map<String, C74680b> map;
        Aweme b;
        List<TextExtraStruct> textExtra;
        TextExtraStruct textExtraStruct;
        if (f180988b == null) {
            return null;
        }
        IAwemeService iAwemeService = f180990d;
        if (iAwemeService == null || (b = iAwemeService.mo60684b(str)) == null || (textExtra = b.getTextExtra()) == null || (textExtraStruct = (TextExtraStruct) C89070n.m154583g((List) textExtra)) == null) {
            str2 = null;
        } else {
            str2 = textExtraStruct.getHashTagName();
        }
        if (!TextUtils.isEmpty(str2) && (map = f180988b) != null) {
            if (str2 == null) {
                C89219l.m154715b();
            }
            C74680b bVar = map.get(str2);
            if (bVar != null) {
                return C80947d.m140482a(bVar);
            }
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.bitrateselector.p2391a.AbstractC34852c
    /* renamed from: a */
    public final AbstractC81962a mo61717a(String str) {
        Double d;
        Double d2;
        Double d3;
        Double d4;
        m140493a();
        Double d5 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str == null) {
            C89219l.m154715b();
        }
        AbstractC81962a b = m140494b(str);
        StringBuilder append = new StringBuilder("getAutoBitrateSet ").append(str).append(' ').append(b).append(" first ");
        if (b != null) {
            d = Double.valueOf(b.mo61720a());
        } else {
            d = null;
        }
        StringBuilder append2 = append.append(d).append(" second ");
        if (b != null) {
            d2 = Double.valueOf(b.mo61721b());
        } else {
            d2 = null;
        }
        StringBuilder append3 = append2.append(d2).append(" third ");
        if (b != null) {
            d3 = Double.valueOf(b.mo61722c());
        } else {
            d3 = null;
        }
        StringBuilder append4 = append3.append(d3).append(" fourth ");
        if (b != null) {
            d4 = Double.valueOf(b.mo61723d());
        } else {
            d4 = null;
        }
        StringBuilder append5 = append4.append(d4).append(" minBitrate ");
        if (b != null) {
            d5 = Double.valueOf(b.mo61724e());
        }
        append5.append(d5);
        return b;
    }
}
