package com.bytedance.android.live.broadcast.preview.widget;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.broadcast.C3802x;
import com.bytedance.android.live.broadcast.C3804z;
import com.bytedance.android.live.broadcast.model.C3263i;
import com.bytedance.android.livesdk.p561j.C9115e;
import com.bytedance.android.livesdkapi.depend.model.live.EnumC11728i;
import com.bytedance.android.livesdkapi.p699l.C11825a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class PreviewApplyWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    public static final C3578a f9906a = new C3578a((byte) 0);

    /* renamed from: b */
    private final C11825a f9907b = ((C11825a) DataChannelGlobal.f42558d.mo28324b(C9115e.class));

    static {
        Covode.recordClassIndex(4066);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bgc;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewApplyWidget$a */
    public static final class C3578a {
        static {
            Covode.recordClassIndex(4067);
        }

        private C3578a() {
        }

        public /* synthetic */ C3578a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private final String m8996b() {
        Object b = this.dataChannel.mo28318b(C3802x.class);
        if (b == null) {
            C89219l.m154715b();
        }
        String modeFromServer = ((EnumC11728i) b).getModeFromServer();
        C89219l.m154716b(modeFromServer, "");
        return modeFromServer;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mo28310a(C3802x.class, (AbstractC89172b) new C3579b(this)).mo28314b(C3804z.class, (AbstractC89172b) new C3580c(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8869a() {
        /*
        // Method dump skipped, instructions count: 518
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.widget.PreviewApplyWidget.mo8869a():void");
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewApplyWidget$b */
    static final class C3579b extends AbstractC89220m implements AbstractC89172b<EnumC11728i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewApplyWidget f9908a;

        static {
            Covode.recordClassIndex(4068);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3579b(PreviewApplyWidget previewApplyWidget) {
            super(1);
            this.f9908a = previewApplyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC11728i iVar) {
            C89219l.m154721d(iVar, "");
            this.f9908a.mo8869a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.widget.PreviewApplyWidget$c */
    static final class C3580c extends AbstractC89220m implements AbstractC89172b<Map<String, ? extends C3263i.C3264a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PreviewApplyWidget f9909a;

        static {
            Covode.recordClassIndex(4069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3580c(PreviewApplyWidget previewApplyWidget) {
            super(1);
            this.f9909a = previewApplyWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Map<String, ? extends C3263i.C3264a> map) {
            C89219l.m154721d(map, "");
            this.f9909a.mo8869a();
            return C89391z.f203057a;
        }
    }
}
