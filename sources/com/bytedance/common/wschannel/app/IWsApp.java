package com.bytedance.common.wschannel.app;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.List;
import org.json.JSONObject;

public interface IWsApp extends Parcelable {
    static {
        Covode.recordClassIndex(15678);
    }

    /* renamed from: a */
    int mo21927a();

    /* renamed from: b */
    int mo21928b();

    /* renamed from: c */
    String mo21929c();

    /* renamed from: d */
    String mo21930d();

    /* renamed from: e */
    int mo21931e();

    /* renamed from: f */
    int mo21932f();

    /* renamed from: g */
    JSONObject mo21933g();

    /* renamed from: h */
    String mo21934h();

    /* renamed from: i */
    int mo21935i();

    /* renamed from: j */
    String mo21936j();

    /* renamed from: k */
    List<String> mo21937k();
}
