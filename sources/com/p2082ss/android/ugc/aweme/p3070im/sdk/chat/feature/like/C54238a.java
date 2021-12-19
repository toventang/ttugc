package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.single.p3124a.C54315a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.C54839a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.a */
public final class C54238a {

    /* renamed from: a */
    public final AbstractC1204m f124251a;

    /* renamed from: b */
    public final View f124252b;

    /* renamed from: c */
    public final RecyclerView f124253c;

    /* renamed from: d */
    public final AbstractC54386c f124254d;

    /* renamed from: e */
    public final C54315a f124255e;

    static {
        Covode.recordClassIndex(63927);
    }

    public C54238a(AbstractC1204m mVar, View view, RecyclerView recyclerView, AbstractC54386c cVar, C54315a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(view, "");
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        this.f124251a = mVar;
        this.f124252b = view;
        this.f124253c = recyclerView;
        this.f124254d = cVar;
        this.f124255e = aVar;
        cVar.mo91464a(new AbstractC54386c.AbstractC54392b(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.like.C54238a.C542391 */

            /* renamed from: a */
            final /* synthetic */ C54238a f124256a;

            static {
                Covode.recordClassIndex(63928);
            }

            {
                this.f124256a = r1;
            }

            /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.feature.like.a$1$a */
            static final class RunnableC54240a implements Runnable {

                /* renamed from: a */
                final /* synthetic */ int f124257a;

                /* renamed from: b */
                final /* synthetic */ C542391 f124258b;

                static {
                    Covode.recordClassIndex(63929);
                }

                RunnableC54240a(int i, C542391 r2) {
                    this.f124257a = i;
                    this.f124258b = r2;
                }

                public final void run() {
                    this.f124258b.f124256a.f124253c.mo4435d(this.f124257a);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.AbstractC54386c.AbstractC54392b
            /* renamed from: a */
            public final void mo91330a() {
                Integer num;
                String message_id;
                C19638h a = AbstractC17420a.C17421a.m32276a().mo27720a(this.f124256a.f124254d.f124584n.getConversationId());
                if (a != null) {
                    if (this.f124256a.f124255e.getUnreadCount() == 0 && C54881c.m100494a(a)) {
                        C54839a c = C54881c.m100498c(a);
                        if (c != null) {
                            num = c.getMark_read();
                        } else {
                            num = null;
                        }
                        if (num != null && num.intValue() == 1) {
                            C56244a.m102191c("DmHelper", "DmLikeLocateDelegate->not locate cause mark_read");
                            return;
                        } else if (c != null && (message_id = c.getMessage_id()) != null) {
                            AbstractC54386c cVar = this.f124256a.f124254d;
                            if (cVar.f124543b != null && !cVar.f124543b.isEmpty()) {
                                int min = Math.min(cVar.f124543b.size(), 20);
                                int i = 0;
                                while (true) {
                                    if (i >= min) {
                                        break;
                                    } else if (TextUtils.equals(((C19538ai) cVar.f124543b.get(i)).getUuid(), message_id)) {
                                        C56244a.m102191c("MessageAdapter", "findMsgByMsgUUid get for index:".concat(String.valueOf(i)));
                                        if (i != -1) {
                                            C56244a.m102191c("DmHelper", "DmLikeLocateDelegate->locate:".concat(String.valueOf(i)));
                                            this.f124256a.f124253c.post(new RunnableC54240a(i, this));
                                        }
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                    C54881c.m100501e(a);
                }
            }
        });
    }
}
