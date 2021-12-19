package com.p2082ss.android.ugc.aweme.video.simcommon;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2397bm.C34888b;
import com.p2082ss.android.ugc.aweme.video.p4208b.C80695q;
import com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.video.simcommon.SimALog */
public class SimALog implements IALog {
    static {
        Covode.recordClassIndex(94244);
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public boolean isEnabled() {
        return C80695q.m139908a();
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog
    /* renamed from: d */
    public void mo124331d(String str) {
        C34888b.m71264a(str);
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog
    /* renamed from: e */
    public void mo124333e(String str, String str2) {
        C34888b.m71265a(str, str2);
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog
    /* renamed from: d */
    public void mo124332d(String str, JSONObject jSONObject) {
        C34888b.m71266b(str, jSONObject);
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog
    /* renamed from: e */
    public void mo124334e(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        if (C80695q.m139908a()) {
            String a = C34888b.m71263a(str, jSONObject);
            if (!TextUtils.isEmpty(a)) {
                C89219l.m154721d(a, "");
                if (C80695q.m139908a()) {
                    C51423a.m95784a(6, C34888b.f82334a, a);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog
    /* renamed from: i */
    public void mo124335i(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        if (C80695q.m139908a()) {
            String a = C34888b.m71263a(str, jSONObject);
            if (!TextUtils.isEmpty(a)) {
                C89219l.m154721d(a, "");
                if (C80695q.m139908a()) {
                    C51423a.m95784a(4, C34888b.f82334a, a);
                }
            }
        }
    }

    /* renamed from: v */
    public void mo124337v(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        if (C80695q.m139908a()) {
            String a = C34888b.m71263a(str, jSONObject);
            if (!TextUtils.isEmpty(a)) {
                C89219l.m154721d(a, "");
                if (C80695q.m139908a()) {
                    C51423a.m95784a(2, C34888b.f82334a, a);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.playerkit.simapicommon.reporter.IALog
    /* renamed from: w */
    public void mo124338w(String str, JSONObject jSONObject) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        if (C80695q.m139908a()) {
            String a = C34888b.m71263a(str, jSONObject);
            if (!TextUtils.isEmpty(a)) {
                C89219l.m154721d(a, "");
                if (C80695q.m139908a()) {
                    C51423a.m95784a(5, C34888b.f82334a, a);
                }
            }
        }
    }
}
