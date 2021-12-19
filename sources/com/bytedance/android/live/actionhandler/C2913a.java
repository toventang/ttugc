package com.bytedance.android.live.actionhandler;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.actionhandler.a */
public class C2913a implements IActionHandlerService {
    static {
        Covode.recordClassIndex(3344);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean canHandle(Uri uri) {
        return false;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handle(Context context, Uri uri) {
        return false;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handle(Context context, String str) {
        return false;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(uri, "");
        C89219l.m154721d(map, "");
        return false;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handleWithoutHost(Context context, String str) {
        return false;
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public void postReportReason(long j, long j2, long j3, String str) {
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean showUserProfile(long j) {
        return false;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean showUserProfile(long j, String str, Map<String, String> map) {
        return false;
    }
}
