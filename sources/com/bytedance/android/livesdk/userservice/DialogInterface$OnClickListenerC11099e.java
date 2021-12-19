package com.bytedance.android.livesdk.userservice;

import android.content.DialogInterface;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.AbstractC11807g;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.userservice.e */
final /* synthetic */ class DialogInterface$OnClickListenerC11099e implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final String f26691a;

    /* renamed from: b */
    private final long f26692b;

    /* renamed from: c */
    private final String f26693c;

    /* renamed from: d */
    private final boolean f26694d = false;

    /* renamed from: e */
    private final String f26695e;

    /* renamed from: f */
    private final String f26696f;

    /* renamed from: g */
    private final DialogInterface.OnClickListener f26697g;

    static {
        Covode.recordClassIndex(12722);
    }

    DialogInterface$OnClickListenerC11099e(String str, long j, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener) {
        this.f26691a = str;
        this.f26692b = j;
        this.f26693c = str2;
        this.f26695e = str3;
        this.f26696f = str4;
        this.f26697g = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.f26691a;
        long j = this.f26692b;
        String str2 = this.f26693c;
        boolean z = this.f26694d;
        String str3 = this.f26695e;
        String str4 = this.f26696f;
        DialogInterface.OnClickListener onClickListener = this.f26697g;
        try {
            new JSONObject().put("source", str);
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("follow_source", str);
        hashMap.put("user_id", String.valueOf(j));
        hashMap.put("enter_from", str2);
        hashMap.put("source", str2);
        if (z) {
            hashMap.put("event_type", "click");
            hashMap.put("event_belong", "video");
            hashMap.put("event_module", "toast");
            if (!C13627m.m24498a(str3)) {
                hashMap.put("event_page", str3);
            }
            if (!C13627m.m24498a(str4)) {
                hashMap.put("enter_from", str4);
            }
        }
        ((AbstractC11807g) C6193a.m13435a(AbstractC11807g.class)).mo18865a("unfollow_popup_confirm", hashMap);
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
