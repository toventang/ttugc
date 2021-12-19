package com.p2082ss.android.ugc.aweme.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.ugc.aweme.internal.IInternalCommerceService */
public interface IInternalCommerceService {
    static {
        Covode.recordClassIndex(66679);
    }

    /* renamed from: a */
    UrlModel mo93959a(String str);

    /* renamed from: a */
    void mo93960a(int i);

    /* renamed from: a */
    void mo93961a(String str, String str2);

    /* renamed from: a */
    boolean mo93962a();

    /* renamed from: a */
    boolean mo93963a(Context context, String str, TextView textView, Boolean bool, String str2);

    /* renamed from: a */
    boolean mo93964a(Music music);

    /* renamed from: b */
    boolean mo93965b();

    /* renamed from: c */
    void mo93966c();

    /* renamed from: d */
    LinkedHashMap<String, Bitmap> mo93967d();

    /* renamed from: e */
    boolean mo93968e();

    /* renamed from: f */
    boolean mo93969f();

    /* renamed from: g */
    void mo93970g();
}
