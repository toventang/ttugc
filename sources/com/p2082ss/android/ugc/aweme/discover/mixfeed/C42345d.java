package com.p2082ss.android.ugc.aweme.discover.mixfeed;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.utils.C34721g;
import com.p2082ss.android.ugc.aweme.discover.model.Layout;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.live.C58589b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d */
public class C42345d implements Serializable {
    @AbstractC27891c(mo46611a = "layout")

    /* renamed from: a */
    Layout f98646a;
    @AbstractC27891c(mo46611a = "raw_data")

    /* renamed from: b */
    String f98647b;
    @AbstractC27891c(mo46611a = "schema")

    /* renamed from: c */
    String f98648c;
    @AbstractC27891c(mo46611a = "bullet_schema")

    /* renamed from: d */
    String f98649d;
    @AbstractC27891c(mo46611a = "height")

    /* renamed from: e */
    int f98650e;
    @AbstractC27891c(mo46611a = "width")

    /* renamed from: f */
    int f98651f;
    @AbstractC27891c(mo46611a = "origin_type")

    /* renamed from: g */
    int f98652g;

    /* renamed from: h */
    private Object f98653h = new Object();
    @AbstractC27891c(mo46611a = "aweme_list")

    /* renamed from: i */
    private List<Aweme> f98654i;

    static {
        Covode.recordClassIndex(50290);
    }

    /* renamed from: com_ss_android_ugc_aweme_discover_mixfeed_DynamicPatch_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m84710xb616ec61(String str, String str2, Throwable th) {
        return 0;
    }

    public List<Aweme> getAwemeList() {
        return this.f98654i;
    }

    public String getBulletSchema() {
        return this.f98649d;
    }

    public int getHeight() {
        return this.f98650e;
    }

    public Object getKey() {
        return this.f98653h;
    }

    public Layout getLayout() {
        return this.f98646a;
    }

    public int getOriginType() {
        return this.f98652g;
    }

    public String getRawData() {
        return this.f98647b;
    }

    public String getSchema() {
        return this.f98648c;
    }

    public int getWidth() {
        return this.f98651f;
    }

    public List<Map<?, ?>> getAwemeListRaw() {
        return m84709a(this.f98654i);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        Layout layout = this.f98646a;
        int i4 = 0;
        if (layout != null) {
            i = layout.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str = this.f98647b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str2 = this.f98648c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str3 = this.f98649d;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i7 + i4) * 31) + this.f98651f) * 31) + this.f98650e;
    }

    public String toString() {
        return "DynamicPatch{key=" + this.f98653h + ", layout=" + this.f98646a + ", rawData='" + this.f98647b + '\'' + ", schema='" + this.f98648c + '\'' + ", bulletSchema='" + this.f98649d + '\'' + ", height=" + this.f98650e + ", width=" + this.f98651f + ", originType=" + this.f98652g + ", mAwemeList=" + this.f98654i + '}';
    }

    public void setAwemeList(List<Aweme> list) {
        this.f98654i = list;
    }

    public void setBulletSchema(String str) {
        this.f98649d = str;
    }

    public void setHeight(int i) {
        this.f98650e = i;
    }

    public void setLayout(Layout layout) {
        this.f98646a = layout;
    }

    public void setOriginType(int i) {
        this.f98652g = i;
    }

    public void setRawData(String str) {
        this.f98647b = str;
    }

    public void setSchema(String str) {
        this.f98648c = str;
    }

    public void setWidth(int i) {
        this.f98651f = i;
    }

    public String getAwemeListFirstStr(int i) {
        List<Aweme> list = this.f98654i;
        if (list == null || list.size() <= i) {
            return null;
        }
        return new C27910f().mo46674b(this.f98654i.get(i));
    }

    public List<Map<?, ?>> getAwemeListRawByPosition(int i) {
        Aweme aweme = this.f98654i.get(i);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(aweme);
        return m84709a(arrayList);
    }

    /* renamed from: a */
    private static List<Map<?, ?>> m84709a(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        try {
            for (Aweme aweme : list) {
                arrayList.add(C58589b.m107696a().mo46670a(C58589b.m107696a().mo46674b(aweme), Map.class));
            }
        } catch (Exception e) {
            m84710xb616ec61("DynamicPatch", "Aweme list gson convert error.", e);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42345d)) {
            return false;
        }
        C42345d dVar = (C42345d) obj;
        if (this.f98650e == dVar.f98650e && this.f98651f == dVar.f98651f && C34721g.m70920a(this.f98646a, dVar.f98646a) && C34721g.m70920a(this.f98647b, dVar.f98647b) && C34721g.m70920a(this.f98654i, dVar.f98654i) && C34721g.m70920a(this.f98648c, dVar.f98648c) && C34721g.m70920a(this.f98649d, dVar.f98649d)) {
            return true;
        }
        return false;
    }
}
