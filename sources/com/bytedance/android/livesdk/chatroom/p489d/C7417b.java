package com.bytedance.android.livesdk.chatroom.p489d;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.p186d.AbstractC3055a;
import com.bytedance.android.live.broadcast.stream.p207c.C3687b;
import com.bytedance.android.live.core.p218f.C3941k;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p561j.C9075cn;
import com.bytedance.android.livesdk.p561j.C9093de;
import com.bytedance.android.livesdk.utils.C11291z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.chatroom.d.b */
public final class C7417b {

    /* renamed from: a */
    final AbstractC3055a f18399a;

    /* renamed from: b */
    final C3687b f18400b;

    /* renamed from: c */
    private final DataChannel f18401c;

    static {
        Covode.recordClassIndex(8184);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.d.b$a */
    public static final class C7419a implements C3951p.AbstractC3955b {

        /* renamed from: a */
        final /* synthetic */ C7417b f18402a;

        /* renamed from: b */
        final /* synthetic */ PrivacyCert f18403b;

        static {
            Covode.recordClassIndex(8186);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3955b
        /* renamed from: a */
        public final void mo9305a() {
            this.f18402a.mo13620a(null, this.f18403b);
        }

        @Override // com.bytedance.android.live.core.p218f.C3951p.AbstractC3955b
        /* renamed from: a */
        public final void mo9306a(Bitmap bitmap) {
            Bitmap createBitmap;
            MethodCollector.m26663i(7585);
            C7417b bVar = this.f18402a;
            if (bitmap == null) {
                createBitmap = null;
            } else {
                Matrix matrix = new Matrix();
                matrix.postScale(1.0f, -1.0f);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            }
            bVar.mo13620a(createBitmap, this.f18403b);
            MethodCollector.m26664o(7585);
        }

        C7419a(C7417b bVar, PrivacyCert privacyCert) {
            this.f18402a = bVar;
            this.f18403b = privacyCert;
        }
    }

    /* renamed from: a */
    public final void mo13621a(PrivacyCert privacyCert) {
        User owner;
        ImageModel avatarThumb;
        C89219l.m154721d(privacyCert, "");
        float c = ((float) C3966y.m9664c()) / ((float) C3966y.m9662b());
        Room room = (Room) this.f18401c.mo28318b(C9093de.class);
        if (room != null && (owner = room.getOwner()) != null && (avatarThumb = owner.getAvatarThumb()) != null) {
            C3941k.m9599a(avatarThumb, C3966y.m9664c(), C3966y.m9662b(), new C11291z(5, c), new C7419a(this, privacyCert));
        }
    }

    /* renamed from: a */
    public final void mo13620a(Bitmap bitmap, PrivacyCert privacyCert) {
        if (bitmap != null) {
            AbstractC3055a aVar = this.f18399a;
            if (aVar != null) {
                aVar.mo8284a(bitmap, privacyCert);
                return;
            }
            return;
        }
        AbstractC3055a aVar2 = this.f18399a;
        if (aVar2 != null) {
            aVar2.mo8297b(privacyCert);
        }
    }

    public C7417b(DataChannel dataChannel, AbstractC3055a aVar, C3687b bVar) {
        C89219l.m154721d(dataChannel, "");
        this.f18401c = dataChannel;
        this.f18399a = aVar;
        this.f18400b = bVar;
        dataChannel.mo28310a(C9075cn.class, (AbstractC89172b) new AbstractC89172b<Boolean, C89391z>(this) {
            /* class com.bytedance.android.livesdk.chatroom.p489d.C7417b.C74181 */

            static {
                Covode.recordClassIndex(8185);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                C7417b bVar = (C7417b) this.receiver;
                if (booleanValue) {
                    bVar.mo13621a(PrivacyCert.Builder.Companion.with("bpea-782").usage("").tag("click pause live").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    C3687b bVar2 = bVar.f18400b;
                    if (bVar2 != null) {
                        bVar2.mo8959c();
                    }
                } else {
                    AbstractC3055a aVar = bVar.f18399a;
                    if (aVar != null) {
                        aVar.mo8309k(PrivacyCert.Builder.Companion.with("bpea-781").usage("").tag("click continue live").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                    }
                    C3687b bVar3 = bVar.f18400b;
                    if (bVar3 != null) {
                        bVar3.mo8958b();
                    }
                }
                return C89391z.f203057a;
            }
        });
    }
}
