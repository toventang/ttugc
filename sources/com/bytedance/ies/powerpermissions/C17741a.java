package com.bytedance.ies.powerpermissions;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.p1241d.AbstractC17752a;
import com.bytedance.ies.powerpermissions.p1241d.C17754b;
import com.bytedance.ies.powerpermissions.p1241d.C17755c;
import com.bytedance.ies.powerpermissions.p1241d.C17756d;
import com.bytedance.ies.powerpermissions.p1241d.C17757e;
import com.bytedance.ies.powerpermissions.p1241d.C17758f;
import com.bytedance.ies.powerpermissions.p1241d.C17759g;
import com.bytedance.ies.powerpermissions.p1241d.C17760h;
import com.bytedance.ies.powerpermissions.p1241d.C17761i;
import com.bytedance.ies.powerpermissions.p1241d.C17762j;
import com.bytedance.ies.powerpermissions.p1241d.C17763k;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.a */
public final class C17741a {

    /* renamed from: a */
    static final HashMap<String, AbstractC17752a> f42411a = new HashMap<>();

    /* renamed from: b */
    public static final C17741a f42412b = new C17741a();

    private C17741a() {
    }

    static {
        Covode.recordClassIndex(20305);
        if (C17770j.m32965e()) {
            C177421.m32882a(new C17754b());
            C177421.m32882a(new C17755c("android.permission.ACCESS_MEDIA_LOCATION"));
            C177421.m32882a(new C17755c("android.permission.ACCESS_BACKGROUND_LOCATION"));
            C177421.m32882a(new C17756d());
            C177421.m32882a(new C17757e());
            C177421.m32882a(new C17758f());
            C177421.m32882a(new C17759g());
            C177421.m32882a(new C17760h());
            C177421.m32882a(new C17761i());
            C177421.m32882a(new C17762j());
            C177421.m32882a(new C17763k());
        }
    }

    /* renamed from: a */
    public static AbstractC17752a m32880a(String str) {
        C89219l.m154719c(str, "");
        return f42411a.get(str);
    }

    /* renamed from: b */
    public static boolean m32881b(String str) {
        C89219l.m154719c(str, "");
        return f42411a.containsKey(str);
    }
}
