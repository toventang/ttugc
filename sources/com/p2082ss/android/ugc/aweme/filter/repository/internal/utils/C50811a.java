package com.p2082ss.android.ugc.aweme.filter.repository.internal.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.utils.FilterConfig;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p4600h.p4601a.C89070n;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.utils.a */
public final class C50811a {

    /* renamed from: a */
    public static final HashMap<Integer, Boolean> f117257a = new HashMap<>();

    /* renamed from: b */
    public static final HashMap<Integer, FilterConfig> f117258b = new HashMap<>();

    /* renamed from: c */
    public static C27910f f117259c = new C27910f();

    static {
        Covode.recordClassIndex(59982);
    }

    /* renamed from: b */
    public static final String m95160b(FilterBean filterBean) {
        List<FilterConfig.FilterConfigItem> items;
        C89219l.m154721d(filterBean, "");
        FilterConfig d = m95162d(filterBean);
        if (d == null || (items = d.getItems()) == null || !(!items.isEmpty())) {
            return "Filter_intensity";
        }
        return items.get(0).getTag();
    }

    /* renamed from: c */
    public static final float m95161c(FilterBean filterBean) {
        List<FilterConfig.FilterConfigItem> items;
        FilterConfig.FilterConfigItem filterConfigItem;
        int max;
        C89219l.m154721d(filterBean, "");
        FilterConfig d = m95162d(filterBean);
        if (d == null || (items = d.getItems()) == null || (filterConfigItem = (FilterConfig.FilterConfigItem) C89070n.m154583g((List) items)) == null || (max = filterConfigItem.getMax() - filterConfigItem.getMin()) == 0) {
            return 0.0f;
        }
        return ((float) filterConfigItem.getValue()) / ((float) max);
    }

    /* renamed from: a */
    public static final boolean m95159a(FilterBean filterBean) {
        MethodCollector.m26663i(3121);
        C89219l.m154721d(filterBean, "");
        HashMap<Integer, Boolean> hashMap = f117257a;
        Boolean bool = hashMap.get(Integer.valueOf(filterBean.getId()));
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            MethodCollector.m26664o(3121);
            return booleanValue;
        }
        String filterFolder = filterBean.getFilterFolder();
        boolean z = false;
        if (filterFolder == null) {
            MethodCollector.m26664o(3121);
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(filterFolder, "config.json"));
            try {
                boolean has = new JSONObject(C84902i.m145884a((InputStream) fileInputStream)).has("effect");
                hashMap.put(Integer.valueOf(filterBean.getId()), Boolean.valueOf(has));
                C89146c.m154636a(fileInputStream, null);
                z = has;
                MethodCollector.m26664o(3121);
                return z;
            } catch (Throwable th) {
                C89146c.m154636a(fileInputStream, th);
                MethodCollector.m26664o(3121);
                throw th;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    private static FilterConfig m95162d(FilterBean filterBean) {
        boolean z;
        FilterConfigExtra filterConfigExtra;
        String filterconfig;
        C89219l.m154721d(filterBean, "");
        HashMap<Integer, FilterConfig> hashMap = f117258b;
        FilterConfig filterConfig = hashMap.get(Integer.valueOf(filterBean.getId()));
        if (filterConfig != null) {
            return filterConfig;
        }
        String extra = filterBean.getExtra();
        if (extra == null || C89361p.m154870a((CharSequence) extra)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        try {
            if (f117259c == null) {
                f117259c = new C27910f();
            }
            C27910f fVar = f117259c;
            if (fVar == null || (filterConfigExtra = (FilterConfigExtra) fVar.mo46670a(extra, FilterConfigExtra.class)) == null || (filterconfig = filterConfigExtra.getFilterconfig()) == null) {
                return null;
            }
            FilterConfig filterConfig2 = (FilterConfig) fVar.mo46670a(filterconfig, FilterConfig.class);
            Integer valueOf = Integer.valueOf(filterBean.getId());
            C89219l.m154716b(filterConfig2, "");
            hashMap.put(valueOf, filterConfig2);
            return filterConfig2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final String m95158a(FilterBean filterBean, float f) {
        C89219l.m154721d(filterBean, "");
        return filterBean.getFilterFolder() + ':' + m95160b(filterBean) + ':' + f;
    }
}
