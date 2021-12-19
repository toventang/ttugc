package com.p2082ss.android.ugc.aweme.search;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p2082ss.android.ugc.aweme.p2226a.C31292a;
import com.p2082ss.android.ugc.aweme.search.EnumC67453i;
import com.p2082ss.android.ugc.aweme.search.p3684b.C67352c;
import com.p2082ss.android.ugc.aweme.search.p3684b.C67354d;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.j */
public final class C67458j {

    /* renamed from: a */
    public static final List<EnumC67453i> f151132a;

    /* renamed from: b */
    public static final int f151133b;

    /* renamed from: c */
    public static final int f151134c;

    /* renamed from: d */
    public static final int f151135d;

    /* renamed from: e */
    public static final int f151136e;

    /* renamed from: f */
    public static final int f151137f;

    /* renamed from: g */
    public static final int f151138g;

    /* renamed from: h */
    public static final int f151139h;

    /* renamed from: i */
    public static final C67458j f151140i = new C67458j();

    /* renamed from: j */
    private static final List<EnumC67453i> f151141j;

    private C67458j() {
    }

    /* renamed from: a */
    public static final int m119526a() {
        return f151132a.size();
    }

    static {
        Covode.recordClassIndex(79095);
        List<EnumC67453i> b = C89070n.m154522b(EnumC67453i.TOP, EnumC67453i.USER, EnumC67453i.VIDEO, EnumC67453i.SOUND, EnumC67453i.SHOP, EnumC67453i.LIVE, EnumC67453i.HASHTAG);
        f151141j = b;
        ArrayList arrayList = new ArrayList();
        for (T t : b) {
            int i = C67460k.f151142a[t.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 && C16048b.m29633a().mo25412a(true, "show_vertical_search_shop_tab", 0) != 1) {
                        }
                    } else if (!C31292a.m65465a()) {
                    }
                } else if (((Number) C67354d.f150925a.getValue()).intValue() == 1) {
                }
            } else if (((Number) C67352c.f150922a.getValue()).intValue() == 1) {
            }
            arrayList.add(t);
        }
        ArrayList<EnumC67453i> arrayList2 = arrayList;
        for (EnumC67453i iVar : arrayList2) {
            iVar.getTabName();
        }
        f151132a = arrayList2;
        f151133b = arrayList2.indexOf(EnumC67453i.TOP);
        f151134c = arrayList2.indexOf(EnumC67453i.USER);
        f151135d = arrayList2.indexOf(EnumC67453i.VIDEO);
        f151136e = arrayList2.indexOf(EnumC67453i.SOUND);
        f151137f = arrayList2.indexOf(EnumC67453i.SHOP);
        f151138g = arrayList2.indexOf(EnumC67453i.HASHTAG);
        f151139h = arrayList2.indexOf(EnumC67453i.LIVE);
    }

    /* renamed from: a */
    public static final int m119527a(String str) {
        C89219l.m154721d(str, "");
        return C89070n.m154546a((List) f151132a, (Object) EnumC67453i.C67454a.m119523a(str));
    }

    /* renamed from: a */
    public static final String m119528a(int i) {
        EnumC67453i iVar;
        String tabName;
        if (i < 0) {
            return "";
        }
        List<EnumC67453i> list = f151132a;
        if (i >= list.size() || (iVar = (EnumC67453i) C89070n.m154561b((List) list, i)) == null || (tabName = iVar.getTabName()) == null) {
            return "";
        }
        return tabName;
    }

    /* renamed from: b */
    public static final int m119530b(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) "challenge")) {
            str = EnumC67453i.HASHTAG.getTabName();
        }
        return C89070n.m154546a((List) f151132a, (Object) EnumC67453i.C67454a.m119523a(str));
    }

    /* renamed from: a */
    public static final String m119529a(ActivityC0945e eVar) {
        if (eVar == null) {
            return "";
        }
        Integer value = ((SearchIntermediateViewModel) C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(SearchIntermediateViewModel.class)).getSearchTabIndex().getValue();
        int i = f151133b;
        if (value != null && value.intValue() == i) {
            return "general_search";
        }
        return "search_result";
    }

    /* renamed from: b */
    public static final String m119531b(int i) {
        if (i < 0) {
            return EnumC67453i.TOP.getTabName();
        }
        if (i != f151133b) {
            if (i == f151134c) {
                return EnumC67453i.USER.getTabName();
            }
            if (i == f151135d) {
                return EnumC67453i.VIDEO.getTabName();
            }
            if (i == f151136e) {
                return EnumC67453i.SOUND.getTabName();
            }
            if (i == f151139h) {
                return EnumC67453i.LIVE.getTabName();
            }
            if (i == f151137f) {
                return EnumC67453i.SHOP.getTabName();
            }
            if (i == f151138g) {
                return "challenge";
            }
        }
        return EnumC67453i.TOP.getTabName();
    }
}
