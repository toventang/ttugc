package com.p2082ss.android.ugc.aweme.discover.alading.p2764a;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.common.applog.GlobalContext;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42813a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.a.d */
public final class C41815d extends RecyclerView.ViewHolder {

    /* renamed from: a */
    public View f97542a;

    /* renamed from: b */
    public SmartImageView f97543b;

    /* renamed from: c */
    Aweme f97544c;

    /* renamed from: d */
    public final AbstractC89187q<View, Integer, Aweme, C89391z> f97545d;

    static {
        Covode.recordClassIndex(49731);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.d$a */
    static final class View$OnClickListenerC41816a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41815d f97546a;

        /* renamed from: b */
        final /* synthetic */ Aweme f97547b;

        /* renamed from: c */
        final /* synthetic */ C67568r f97548c;

        static {
            Covode.recordClassIndex(49732);
        }

        View$OnClickListenerC41816a(C41815d dVar, Aweme aweme, C67568r rVar) {
            this.f97546a = dVar;
            this.f97547b = aweme;
            this.f97548c = rVar;
        }

        /* renamed from: a */
        private static boolean m83766a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            long j;
            String str;
            Long l;
            String str2;
            String str3;
            User author;
            User author2;
            User author3;
            User author4;
            User author5;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                View view2 = this.f97546a.itemView;
                C89219l.m154716b(view2, "");
                view2.getContext();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m83766a();
                }
                if (!C58029j.f132256h) {
                    View view3 = this.f97546a.itemView;
                    C89219l.m154716b(view3, "");
                    new C79459a(view3.getContext()).mo123050a(R.string.dcq).mo123053a();
                } else {
                    Aweme aweme = this.f97547b;
                    if (aweme == null || (author5 = aweme.getAuthor()) == null) {
                        j = 0;
                    } else {
                        j = author5.roomId;
                    }
                    String str4 = this.f97548c.f151314i;
                    String str5 = this.f97548c.f151311f;
                    String valueOf = String.valueOf(this.f97548c.f151309d);
                    Aweme aweme2 = this.f97547b;
                    if (aweme2 == null || (author4 = aweme2.getAuthor()) == null || (str = author4.getUid()) == null) {
                        str = "";
                    }
                    Aweme aweme3 = this.f97547b;
                    if (aweme3 == null || (author3 = aweme3.getAuthor()) == null) {
                        l = "";
                    } else {
                        l = Long.valueOf(author3.roomId);
                    }
                    String valueOf2 = String.valueOf(l);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(j));
                    ArrayList arrayList2 = new ArrayList();
                    Aweme aweme4 = this.f97547b;
                    if (aweme4 == null || (author2 = aweme4.getAuthor()) == null || (str2 = author2.getUid()) == null) {
                        str2 = "";
                    }
                    arrayList2.add(new RoomInfo(j, str2));
                    Context context = GlobalContext.getContext();
                    C89219l.m154716b(context, "");
                    EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                    enterRoomConfig.f28232b.f28280x = str4;
                    enterRoomConfig.f28232b.f28281y = str5;
                    enterRoomConfig.f28232b.f28244A = valueOf;
                    enterRoomConfig.f28232b.f28282z = str;
                    enterRoomConfig.f28232b.f28245B = valueOf2;
                    enterRoomConfig.f28232b.f28257a = str4;
                    EnterRoomConfig.LogData logData = enterRoomConfig.f28232b;
                    Aweme aweme5 = this.f97547b;
                    if (aweme5 == null || (author = aweme5.getAuthor()) == null || (str3 = author.getUid()) == null) {
                        str3 = "";
                    }
                    logData.f28258b = str3;
                    enterRoomConfig.f28233c.f28295L = "live_cover";
                    C42813a.m85511a(context, j, arrayList, arrayList2, enterRoomConfig, this.f97548c.f151312g);
                }
                AbstractC89187q<View, Integer, Aweme, C89391z> qVar = this.f97546a.f97545d;
                if (qVar != null) {
                    C89219l.m154716b(view, "");
                    qVar.invoke(view, Integer.valueOf(this.f97546a.getAdapterPosition()), this.f97547b);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.q<? super android.view.View, ? super java.lang.Integer, ? super com.ss.android.ugc.aweme.feed.model.Aweme, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41815d(View view, AbstractC89187q<? super View, ? super Integer, ? super Aweme, C89391z> qVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f97545d = qVar;
        this.f97542a = view;
        LinearGradientDraweeView linearGradientDraweeView = (LinearGradientDraweeView) view.findViewById(R.id.afn);
        C89219l.m154716b(linearGradientDraweeView, "");
        this.f97543b = linearGradientDraweeView;
    }
}
