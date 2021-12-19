package com.bytedance.android.livesdk.dialogv2.widget;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.p384o.AbstractC5834a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.C11300w;
import com.bytedance.android.livesdk.C6909bi;
import com.bytedance.android.livesdk.C9005j;
import com.bytedance.android.livesdk.dialogv2.viewmodel.C8374a;
import com.bytedance.android.livesdk.model.C9914v;
import com.bytedance.android.livesdk.model.message.p579c.C9698b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.service.p624b.C10696a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

public final class LiveGiftDescriptionWidget extends LiveWidget implements AbstractC33974au {

    /* renamed from: a */
    public EnumC8386a f20741a = EnumC8386a.IDLE;

    /* renamed from: b */
    public ImageView f20742b;

    /* renamed from: c */
    public String f20743c;

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftDescriptionWidget$a */
    public enum EnumC8386a {
        IDLE,
        GIFT_DESCRIPTION_SHOW,
        TAB_DESCRIPTION_SHOW;

        static {
            Covode.recordClassIndex(9227);
        }
    }

    static {
        Covode.recordClassIndex(9226);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bg1;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.f20742b = (ImageView) findViewById(R.id.eau);
        findViewById(R.id.eav).setOnClickListener(new View$OnClickListenerC8391c(this));
        this.dataChannel.mo28309a((AbstractC1204m) this, C6909bi.class, (AbstractC89172b) new C8387b(this, (ImageView) findViewById(R.id.c84), (LiveTextView) findViewById(R.id.b_s)));
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftDescriptionWidget$c */
    static final class View$OnClickListenerC8391c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveGiftDescriptionWidget f20751a;

        static {
            Covode.recordClassIndex(9232);
        }

        View$OnClickListenerC8391c(LiveGiftDescriptionWidget liveGiftDescriptionWidget) {
            this.f20751a = liveGiftDescriptionWidget;
        }

        public final void onClick(View view) {
            if (this.f20751a.f20741a == EnumC8386a.TAB_DESCRIPTION_SHOW) {
                Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
                if (this.f20751a.f20743c != null) {
                    if (room != null) {
                        User owner = room.getOwner();
                        if (owner == null || !owner.isSubscribed()) {
                            Context context = this.f20751a.context;
                            C89219l.m154716b(context, "");
                            ((AbstractC5834a) C6193a.m13435a(AbstractC5834a.class)).openUserSubscribeEntry(context, room, "gift_bar");
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (room == null) {
                    return;
                }
                Context context2 = this.f20751a.context;
                C89219l.m154716b(context2, "");
                ((AbstractC5834a) C6193a.m13435a(AbstractC5834a.class)).openUserSubscribeState(context2, room, "gift_bar");
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.LiveGiftDescriptionWidget$b */
    static final class C8387b extends AbstractC89220m implements AbstractC89172b<C10696a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ LiveGiftDescriptionWidget f20745a;

        /* renamed from: b */
        final /* synthetic */ ImageView f20746b;

        /* renamed from: c */
        final /* synthetic */ LiveTextView f20747c;

        static {
            Covode.recordClassIndex(9228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8387b(LiveGiftDescriptionWidget liveGiftDescriptionWidget, ImageView imageView, LiveTextView liveTextView) {
            super(1);
            this.f20745a = liveGiftDescriptionWidget;
            this.f20746b = imageView;
            this.f20747c = liveTextView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C10696a aVar) {
            C9914v vVar;
            ImageModel imageModel;
            C9914v vVar2;
            ImageModel imageModel2;
            C9698b bVar;
            C10696a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            LiveGiftDescriptionWidget liveGiftDescriptionWidget = this.f20745a;
            C10696a.EnumC10697a aVar3 = aVar2.f25752a;
            boolean z = true;
            if (aVar3 != null) {
                int i = C8409b.f20793a[aVar3.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4 && liveGiftDescriptionWidget.f20741a == EnumC8386a.GIFT_DESCRIPTION_SHOW) {
                                liveGiftDescriptionWidget.f20741a = EnumC8386a.IDLE;
                            }
                        } else if (liveGiftDescriptionWidget.f20741a == EnumC8386a.IDLE) {
                            liveGiftDescriptionWidget.f20741a = EnumC8386a.GIFT_DESCRIPTION_SHOW;
                        }
                    } else if (liveGiftDescriptionWidget.f20741a == EnumC8386a.TAB_DESCRIPTION_SHOW || liveGiftDescriptionWidget.f20741a == EnumC8386a.GIFT_DESCRIPTION_SHOW) {
                        liveGiftDescriptionWidget.f20741a = EnumC8386a.IDLE;
                    }
                } else if (liveGiftDescriptionWidget.f20741a == EnumC8386a.IDLE || liveGiftDescriptionWidget.f20741a == EnumC8386a.GIFT_DESCRIPTION_SHOW) {
                    liveGiftDescriptionWidget.f20741a = EnumC8386a.TAB_DESCRIPTION_SHOW;
                }
            }
            C9698b bVar2 = null;
            String str = null;
            if (this.f20745a.f20741a == EnumC8386a.TAB_DESCRIPTION_SHOW && aVar2.f25752a == C10696a.EnumC10697a.TAB_EVENT) {
                C9914v vVar3 = aVar2.f25753b;
                if (!(vVar3 == null || vVar3.f24033a == null || (vVar2 = aVar2.f25753b) == null || vVar2.f24034b == null)) {
                    ImageView imageView = this.f20746b;
                    C9914v vVar4 = aVar2.f25753b;
                    if (vVar4 != null) {
                        imageModel2 = vVar4.f24033a;
                    } else {
                        imageModel2 = null;
                    }
                    C3951p.m9630b(imageView, imageModel2);
                    LiveTextView liveTextView = this.f20747c;
                    C89219l.m154716b(liveTextView, "");
                    C9914v vVar5 = aVar2.f25753b;
                    if (vVar5 != null) {
                        bVar = vVar5.f24034b;
                    } else {
                        bVar = null;
                    }
                    liveTextView.setText(C11300w.m20049a(bVar));
                    View view = this.f20745a.getView();
                    if (view != null) {
                        view.post(new Runnable(this) {
                            /* class com.bytedance.android.livesdk.dialogv2.widget.LiveGiftDescriptionWidget.C8387b.RunnableC83881 */

                            /* renamed from: a */
                            final /* synthetic */ C8387b f20748a;

                            static {
                                Covode.recordClassIndex(9229);
                            }

                            {
                                this.f20748a = r1;
                            }

                            public final void run() {
                                this.f20748a.f20745a.show();
                            }
                        });
                    }
                    C6779a.m14563a().mo13053a(new C9005j());
                    C9914v vVar6 = aVar2.f25753b;
                    if (!(vVar6 == null || vVar6.f24035c == null)) {
                        LiveGiftDescriptionWidget liveGiftDescriptionWidget2 = this.f20745a;
                        C9914v vVar7 = aVar2.f25753b;
                        if (vVar7 != null) {
                            str = vVar7.f24035c;
                        }
                        liveGiftDescriptionWidget2.f20743c = str;
                    }
                    ImageView imageView2 = this.f20745a.f20742b;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                }
            } else if (this.f20745a.f20741a == EnumC8386a.GIFT_DESCRIPTION_SHOW && (aVar2.f25752a == C10696a.EnumC10697a.GIFT_EVENT || aVar2.f25752a == C10696a.EnumC10697a.TAB_EVENT)) {
                C9914v vVar8 = aVar2.f25753b;
                if (!(vVar8 == null || vVar8.f24033a == null || (vVar = aVar2.f25753b) == null || vVar.f24034b == null)) {
                    ImageView imageView3 = this.f20746b;
                    C9914v vVar9 = aVar2.f25753b;
                    if (vVar9 != null) {
                        imageModel = vVar9.f24033a;
                    } else {
                        imageModel = null;
                    }
                    C3951p.m9630b(imageView3, imageModel);
                    LiveTextView liveTextView2 = this.f20747c;
                    C89219l.m154716b(liveTextView2, "");
                    C9914v vVar10 = aVar2.f25753b;
                    if (vVar10 != null) {
                        bVar2 = vVar10.f24034b;
                    }
                    liveTextView2.setText(C11300w.m20049a(bVar2));
                    C6779a.m14563a().mo13053a(new C9005j());
                    View view2 = this.f20745a.getView();
                    if (view2 != null) {
                        view2.post(new Runnable(this) {
                            /* class com.bytedance.android.livesdk.dialogv2.widget.LiveGiftDescriptionWidget.C8387b.RunnableC83892 */

                            /* renamed from: a */
                            final /* synthetic */ C8387b f20749a;

                            static {
                                Covode.recordClassIndex(9230);
                            }

                            {
                                this.f20749a = r1;
                            }

                            public final void run() {
                                this.f20749a.f20745a.show();
                            }
                        });
                    }
                }
                ImageView imageView4 = this.f20745a.f20742b;
                if (imageView4 != null) {
                    imageView4.setVisibility(4);
                }
            } else if (this.f20745a.f20741a == EnumC8386a.IDLE) {
                C6779a.m14563a().mo13053a(new C9005j());
                View view3 = this.f20745a.getView();
                if (view3 != null) {
                    view3.post(new Runnable(this) {
                        /* class com.bytedance.android.livesdk.dialogv2.widget.LiveGiftDescriptionWidget.C8387b.RunnableC83903 */

                        /* renamed from: a */
                        final /* synthetic */ C8387b f20750a;

                        static {
                            Covode.recordClassIndex(9231);
                        }

                        {
                            this.f20750a = r1;
                        }

                        public final void run() {
                            this.f20750a.f20745a.hide();
                        }
                    });
                }
            }
            C8374a aVar4 = C8374a.C8375a.C8376a.f20718a;
            if (this.f20745a.f20741a != EnumC8386a.TAB_DESCRIPTION_SHOW) {
                z = false;
            }
            aVar4.f20717k = z;
            return C89391z.f203057a;
        }
    }
}
