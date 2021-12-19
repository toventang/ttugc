package com.bytedance.android.livesdk.actionhandler;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.p176b.AbstractC2928f;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.browser.p462c.AbstractC6963e;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdkapi.depend.model.report.ReportCommitData;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.actionhandler.a */
public class C6609a implements IActionHandlerService {
    private List<AbstractC6614f> schemaHandlers = new ArrayList();
    private C6626r userProfileActionHandler = new C6626r();

    static {
        Covode.recordClassIndex(7347);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    public C6609a() {
        this.schemaHandlers.add(new RoomActionHandler());
        this.schemaHandlers.add(this.userProfileActionHandler);
        this.schemaHandlers.add(new C6627s());
        this.schemaHandlers.add(new C6616h());
        this.schemaHandlers.add(new C6618j());
        this.schemaHandlers.add(new C6619k());
        this.schemaHandlers.add(new C6612d());
        this.schemaHandlers.add(new C6617i());
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean showUserProfile(long j) {
        return C6626r.m14108a(j, null, null);
    }

    private AbstractC6614f getHandler(Uri uri) {
        for (AbstractC6614f fVar : this.schemaHandlers) {
            if (fVar.canHandle(uri)) {
                return fVar;
            }
        }
        return null;
    }

    static final /* synthetic */ void lambda$postReportReason$1$ActionHandlerService(Throwable th) {
        if (th instanceof C2912a) {
            C11226ao.m19883a(C3966y.m9669e(), ((C2912a) th).getErrorMsg(), 0);
            C3854a.m9458a("ALogger", th);
        }
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean canHandle(Uri uri) {
        for (AbstractC6614f fVar : this.schemaHandlers) {
            if (fVar.canHandle(uri)) {
                return true;
            }
        }
        return false;
    }

    static final /* synthetic */ void lambda$postReportReason$0$ActionHandlerService(C5832d dVar) {
        if (dVar != null && dVar.data != null && !TextUtils.isEmpty(((ReportCommitData) dVar.data).desc)) {
            C11226ao.m19883a(C3966y.m9669e(), ((ReportCommitData) dVar.data).desc, 0);
        }
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handle(Context context, Uri uri) {
        return handleSchema(context, uri, true);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handle(Context context, String str) {
        return handleSchema(context, Uri.parse(str), true);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handleWithoutHost(Context context, String str) {
        return handleSchema(context, Uri.parse(str), false);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean handleWithoutHost(Context context, Uri uri, Map<String, String> map) {
        return handleSchema(context, uri, false, map);
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public boolean showUserProfile(long j, String str, Map<String, String> map) {
        return C6626r.m14108a(j, str, map);
    }

    private boolean handleSchema(Context context, Uri uri, boolean z) {
        if ((TextUtils.equals(uri.getScheme(), "http") || TextUtils.equals(uri.getScheme(), "https")) && z) {
            ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13248a(context, AbstractC6963e.m14872b(uri.toString()));
            return true;
        }
        AbstractC6614f handler = getHandler(uri);
        if (handler != null) {
            return handler.handle(context, uri);
        }
        if (!z || !((IHostAction) C6193a.m13435a(IHostAction.class)).handleSchema(context, uri.toString(), new Bundle())) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.actionhandler.IActionHandlerService
    public void postReportReason(long j, long j2, long j3, String str) {
        ((ActionHandlerApi) C5805e.m12718a().mo11572a(ActionHandlerApi.class)).postReportReasons(j, j2, j3, str).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(C6610b.f16514a, C6611c.f16515a);
    }

    private boolean handleSchema(Context context, Uri uri, boolean z, Map<String, String> map) {
        if ((TextUtils.equals(uri.getScheme(), "http") || TextUtils.equals(uri.getScheme(), "https")) && z) {
            ((AbstractC2928f) C6193a.m13435a(AbstractC2928f.class)).webViewManager().mo13248a(context, AbstractC6963e.m14872b(uri.toString()));
            return true;
        }
        AbstractC6614f handler = getHandler(uri);
        if (handler != null) {
            return handler.handle(context, uri, map);
        }
        if (!z || !((IHostAction) C6193a.m13435a(IHostAction.class)).handleSchema(context, uri.toString(), new Bundle())) {
            return false;
        }
        return true;
    }
}
