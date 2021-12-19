package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42533a;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.e */
public final class C41717e extends RecyclerView.ViewHolder implements WeakHandler.IHandler {

    /* renamed from: g */
    public static final C41719a f97324g = new C41719a((byte) 0);

    /* renamed from: a */
    public final SmartImageView f97325a;

    /* renamed from: b */
    Banner f97326b;

    /* renamed from: c */
    int f97327c;

    /* renamed from: d */
    final WeakHandler f97328d = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: e */
    String f97329e = "";

    /* renamed from: f */
    final AbstractC42533a f97330f;

    static {
        Covode.recordClassIndex(49630);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.e$a */
    public static final class C41719a {
        static {
            Covode.recordClassIndex(49632);
        }

        private C41719a() {
        }

        public /* synthetic */ C41719a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        User user;
        C89219l.m154721d(message, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        Context context = view.getContext();
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof ExecutionException) {
            obj = ((ExecutionException) obj).getCause();
        }
        if (obj instanceof C34485a) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37635a(((C34485a) obj).getErrorMsg()).mo37637b();
        } else if (obj instanceof Exception) {
            View view3 = this.itemView;
            C89219l.m154716b(view3, "");
            new C23144b(view3).mo37640e(R.string.dcr).mo37637b();
        } else if (i == C63419ae.f143971a.getMessageProfile()) {
            if (obj instanceof User) {
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
                user = (User) obj2;
            } else if (obj instanceof UserResponse) {
                user = ((UserResponse) obj).getUser();
            } else {
                return;
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.LogData logData = enterRoomConfig.f28232b;
            Banner banner = this.f97326b;
            if (banner == null) {
                C89219l.m154715b();
            }
            logData.f28257a = banner.getRequestId();
            enterRoomConfig.f28233c.f28293J = "discovery";
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            s.mo95835i().mo105593a(context, user, enterRoomConfig);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41717e(AbstractC42533a aVar, View view) {
        super(view);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.dqg);
        C89219l.m154716b(findViewById, "");
        SmartImageView smartImageView = (SmartImageView) findViewById;
        this.f97325a = smartImageView;
        this.f97330f = aVar;
        smartImageView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41717e.View$OnClickListenerC417181 */

            /* renamed from: a */
            final /* synthetic */ C41717e f97331a;

            static {
                Covode.recordClassIndex(49631);
            }

            {
                this.f97331a = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:69:0x0262  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r22) {
                /*
                // Method dump skipped, instructions count: 1109
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.C41717e.View$OnClickListenerC417181.onClick(android.view.View):void");
            }
        });
    }
}
