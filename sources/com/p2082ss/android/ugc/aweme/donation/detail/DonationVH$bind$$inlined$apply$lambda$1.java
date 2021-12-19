package com.p2082ss.android.ugc.aweme.donation.detail;

import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.detail.DonationVH$bind$$inlined$apply$lambda$1 */
public final class DonationVH$bind$$inlined$apply$lambda$1 extends ForegroundColorSpan {

    /* renamed from: a */
    final /* synthetic */ C43142f f100465a;

    /* renamed from: b */
    final /* synthetic */ String f100466b;

    /* renamed from: c */
    final /* synthetic */ String f100467c;

    static {
        Covode.recordClassIndex(51286);
    }

    public final void updateDrawState(TextPaint textPaint) {
        C89219l.m154721d(textPaint, "");
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DonationVH$bind$$inlined$apply$lambda$1(int i, C43142f fVar, String str, String str2) {
        super(i);
        this.f100465a = fVar;
        this.f100466b = str;
        this.f100467c = str2;
    }
}
