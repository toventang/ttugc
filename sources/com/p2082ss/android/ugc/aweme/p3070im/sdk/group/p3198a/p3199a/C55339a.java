package com.p2082ss.android.ugc.aweme.p3070im.sdk.group.p3198a.p3199a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.bytedance.p1399im.core.p1408d.C19639i;
import com.bytedance.p1399im.core.proto.GroupRole;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.group.data.model.C54006a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55197c;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.a.a.a */
public final class C55339a {

    /* renamed from: a */
    public static final C55339a f126553a = new C55339a();

    private C55339a() {
    }

    static {
        Covode.recordClassIndex(65104);
    }

    /* renamed from: a */
    public static final boolean m101149a(SharePackage sharePackage) {
        String str;
        if (sharePackage != null) {
            str = sharePackage.f155487d;
        } else {
            str = null;
        }
        return C89219l.m154714a((Object) str, (Object) "group");
    }

    /* renamed from: d */
    public static final int m101155d(C19638h hVar) {
        if (m101154c(hVar)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static final String m101147a(int i) {
        String string = C17867d.m33078a().getString(R.string.c6h, Integer.valueOf(i));
        C89219l.m154716b(string, "");
        return string;
    }

    /* renamed from: c */
    public static final boolean m101154c(C19638h hVar) {
        C19639i coreInfo;
        if (hVar == null || (coreInfo = hVar.getCoreInfo()) == null || coreInfo.getOwner() != C55197c.m100923e()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m101148a(C19638h hVar) {
        if (!(hVar == null || !hVar.isGroupChat() || hVar.getCoreInfo() == null)) {
            C19639i coreInfo = hVar.getCoreInfo();
            C89219l.m154716b(coreInfo, "");
            if (coreInfo.getExt() != null) {
                C19639i coreInfo2 = hVar.getCoreInfo();
                C89219l.m154716b(coreInfo2, "");
                if (C89219l.m154714a((Object) coreInfo2.getExt().get("a:s_banned"), (Object) "1")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m101153b(C19638h hVar) {
        if (hVar != null && hVar.isMember() && hVar != null && !hVar.isDissolved()) {
            String str = null;
            if (!(hVar == null || hVar.getCoreInfo() == null)) {
                C19639i coreInfo = hVar.getCoreInfo();
                C89219l.m154716b(coreInfo, "");
                Map<String, String> ext = coreInfo.getExt();
                if (ext != null) {
                    str = ext.get("ban_status");
                }
                if (!C89219l.m154714a((Object) str, (Object) "1")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final String m101156e(C19638h hVar) {
        C19639i coreInfo;
        if (hVar == null || (coreInfo = hVar.getCoreInfo()) == null) {
            String string = C17867d.m33078a().getString(R.string.ain);
            C89219l.m154716b(string, "");
            return string;
        }
        String name = coreInfo.getName();
        if (name == null) {
            return "";
        }
        return name;
    }

    /* renamed from: a */
    public static final boolean m101150a(String str) {
        C89219l.m154721d(str, "");
        C19638h c = AbstractC17427b.C17428a.m32308a(str).mo27749c();
        if (!(c == null || !c.isGroupChat() || c.getCoreInfo() == null)) {
            C19639i coreInfo = c.getCoreInfo();
            C89219l.m154716b(coreInfo, "");
            if (coreInfo.getExt() != null) {
                C19639i coreInfo2 = c.getCoreInfo();
                C89219l.m154716b(coreInfo2, "");
                if (C89219l.m154714a((Object) coreInfo2.getExt().get("a:group_name_modified"), (Object) "1")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m101152a(List<C54006a> list) {
        return m101151a(C55197c.m100919b().toString(), list);
    }

    /* renamed from: a */
    private static boolean m101151a(String str, List<C54006a> list) {
        T t;
        C19537ah member;
        C89219l.m154721d(str, "");
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C89219l.m154714a((Object) t.getUid(), (Object) str)) {
                break;
            }
        }
        T t2 = t;
        if (t2 == null || (member = t2.getMember()) == null || member.getRole() != GroupRole.OWNER.getValue()) {
            return false;
        }
        return true;
    }
}
