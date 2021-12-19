package com.p2082ss.android.pushmanager.p2172a;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2203ug.bus.AbstractC30973a;
import com.p2082ss.android.p2203ug.bus.C30980b;
import com.p2082ss.android.pushmanager.AbstractC30212b;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.a.b */
public final class C30209b {

    /* renamed from: com.ss.android.pushmanager.a.b$a */
    public interface AbstractC30210a extends AbstractC30973a {
        static {
            Covode.recordClassIndex(36716);
        }

        /* renamed from: a */
        void mo35465a();
    }

    /* renamed from: com.ss.android.pushmanager.a.b$b */
    public interface AbstractC30211b extends AbstractC30973a {
        static {
            Covode.recordClassIndex(36717);
        }

        /* renamed from: a */
        AbstractC30212b mo35466a();

        /* renamed from: a */
        void mo35467a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject);

        /* renamed from: a */
        void mo35468a(String str, Bundle bundle);

        /* renamed from: b */
        String mo35469b();

        /* renamed from: c */
        String mo35470c();

        /* renamed from: d */
        String mo35471d();

        /* renamed from: e */
        boolean mo35472e();

        /* renamed from: f */
        Map<String, String> mo35473f();

        /* renamed from: g */
        boolean mo35474g();
    }

    static {
        Covode.recordClassIndex(36715);
    }

    /* renamed from: a */
    public static AbstractC30211b m61099a() {
        return (AbstractC30211b) C30980b.m63694a(AbstractC30211b.class);
    }
}
