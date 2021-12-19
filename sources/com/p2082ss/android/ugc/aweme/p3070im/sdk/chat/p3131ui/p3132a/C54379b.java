package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a;

import androidx.p025c.C0484a;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.service.IFollowService;
import com.p2082ss.android.ugc.aweme.friends.services.FollowService;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.C53709a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.BaseContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareAwemeContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareLiveContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.model.ShareUserContent;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3089e.EnumC53772b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3080b.HandlerC53707g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55085g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.api.C55257a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.data.model.UserStruct;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.trill.R;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.b */
public final class C54379b {

    /* renamed from: a */
    public final AbstractC89516am f124553a = C89517an.m155448a(C89546bf.f203267b);

    /* renamed from: b */
    public final RecyclerView f124554b;

    /* renamed from: c */
    public final HandlerC53707g.AbstractC53708a f124555c;

    /* renamed from: d */
    public final C19538ai f124556d;

    /* renamed from: e */
    public final C53709a f124557e;

    static {
        Covode.recordClassIndex(64082);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.b$a */
    public static final class C54380a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f124558a;

        /* renamed from: b */
        final /* synthetic */ C54379b f124559b;

        static {
            Covode.recordClassIndex(64083);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54380a(C54379b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f124559b = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C54380a(this.f124559b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C54380a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            C89378p pVar;
            boolean z;
            if (this.f124558a == 0) {
                C89382r.m154942a(obj);
                final BaseContent b = EnumC53772b.C53814f.m99071b(this.f124559b.f124556d);
                if (b == null) {
                    return C89391z.f203057a;
                }
                if (b instanceof ShareUserContent) {
                    ShareUserContent shareUserContent = (ShareUserContent) b;
                    pVar = new C89378p(shareUserContent.getSecUid(), shareUserContent.getUid());
                } else if (b instanceof ShareAwemeContent) {
                    ShareAwemeContent shareAwemeContent = (ShareAwemeContent) b;
                    pVar = new C89378p(shareAwemeContent.getSecUid(), shareAwemeContent.getUser());
                } else if (b instanceof ShareLiveContent) {
                    ShareLiveContent shareLiveContent = (ShareLiveContent) b;
                    pVar = new C89378p(shareLiveContent.getRoomSecOwnerId(), shareLiveContent.getRoomOwnerId());
                } else {
                    pVar = new C89378p("", "");
                }
                final String str = (String) pVar.component1();
                final String str2 = (String) pVar.component2();
                C89219l.m154716b(str2, "");
                if (str2.length() == 0) {
                    return C89391z.f203057a;
                }
                long c = AbstractC17427b.C17428a.m32311c(this.f124559b.f124557e.getConversationId());
                C17867d.m33078a();
                C39162r.m79455a("follow", "chat", str2, c);
                String conversationId = this.f124559b.f124557e.getConversationId();
                if (this.f124559b.f124557e.getChatType() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                long c2 = AbstractC17427b.C17428a.m32311c(conversationId);
                C0484a aVar = new C0484a();
                aVar.put("to_user_id", String.valueOf(c2));
                aVar.put("previous_page", "message");
                aVar.put("previous_page_position", "other_places");
                if (z) {
                    aVar.put("enter_from", "group_chat");
                } else {
                    aVar.put("enter_from", "chat");
                }
                aVar.put("enter_method", "card");
                C39162r.m79460a("follow", aVar);
                FollowService.createIFollowServicebyMonsterPlugin(false).sendRequest(str2, str, 1, new IFollowService.AbstractC51636a(this) {
                    /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.p3131ui.p3132a.C54379b.C54380a.C543811 */

                    /* renamed from: a */
                    final /* synthetic */ C54380a f124560a;

                    static {
                        Covode.recordClassIndex(64084);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFollowService.AbstractC51636a
                    /* renamed from: a */
                    public final void mo87342a() {
                        BaseContent baseContent = b;
                        if (baseContent instanceof ShareAwemeContent) {
                            ShareAwemeContent shareAwemeContent = (ShareAwemeContent) baseContent;
                            IMUser iMUser = new IMUser();
                            iMUser.setNickName(shareAwemeContent.getContentName());
                            iMUser.setAvatarThumb(shareAwemeContent.getContentThumb());
                            iMUser.setSignature("");
                            iMUser.setUid(shareAwemeContent.getUser());
                            C89219l.m154716b(iMUser, "");
                            iMUser.setFollowStatus(1);
                            C55085g.m100752a(iMUser);
                        } else if (baseContent instanceof ShareUserContent) {
                            ShareUserContent shareUserContent = (ShareUserContent) baseContent;
                            IMUser iMUser2 = new IMUser();
                            iMUser2.setNickName(shareUserContent.getName());
                            iMUser2.setAvatarThumb(shareUserContent.getAvatar());
                            iMUser2.setSignature("");
                            iMUser2.setUid(shareUserContent.getUid());
                            C89219l.m154716b(iMUser2, "");
                            iMUser2.setFollowStatus(1);
                            C55085g.m100752a(iMUser2);
                        } else if (baseContent instanceof ShareLiveContent) {
                            ShareLiveContent shareLiveContent = (ShareLiveContent) baseContent;
                            IMUser iMUser3 = new IMUser();
                            iMUser3.setNickName(shareLiveContent.getRoomOwnerName());
                            iMUser3.setAvatarThumb(shareLiveContent.getRoomOwnerAvatar());
                            iMUser3.setSignature("");
                            iMUser3.setUid(shareLiveContent.getRoomOwnerId());
                            C89219l.m154716b(iMUser3, "");
                            iMUser3.setFollowStatus(1);
                            C55085g.m100752a(iMUser3);
                        }
                        AbstractC89568bz unused = C89624i.m155555a(this.f124560a.f124559b.f124553a, C89652o.f203399a, null, new C54383b(this, null), 2);
                        AbstractC89568bz unused2 = C89624i.m155555a(this.f124560a.f124559b.f124553a, null, null, new C54384c(this, null), 3);
                        if (this.f124560a.f124559b.f124554b != null) {
                            AbstractC89568bz unused3 = C89624i.m155555a(this.f124560a.f124559b.f124553a, C89652o.f203399a, null, new C54385d(this, null), 2);
                        }
                    }

                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.b$a$1$b */
                    static final class C54383b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                        /* renamed from: a */
                        int f124566a;

                        /* renamed from: b */
                        final /* synthetic */ C543811 f124567b;

                        static {
                            Covode.recordClassIndex(64086);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C54383b(C543811 r2, AbstractC89124d dVar) {
                            super(2, dVar);
                            this.f124567b = r2;
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                            C89219l.m154721d(dVar, "");
                            return new C54383b(this.f124567b, dVar);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                            return ((C54383b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final Object invokeSuspend(Object obj) {
                            if (this.f124566a == 0) {
                                C89382r.m154942a(obj);
                                this.f124567b.f124560a.f124559b.f124555c.mo90255a();
                                return C89391z.f203057a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.friends.service.IFollowService.AbstractC51636a
                    /* renamed from: a */
                    public final void mo87343a(Exception exc) {
                        C89219l.m154721d(exc, "");
                        if (this.f124560a.f124559b.f124554b != null) {
                            AbstractC89568bz unused = C89624i.m155555a(this.f124560a.f124559b.f124553a, C89652o.f203399a, null, new C54382a(this, null), 2);
                        }
                    }

                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.b$a$1$a */
                    static final class C54382a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                        /* renamed from: a */
                        int f124564a;

                        /* renamed from: b */
                        final /* synthetic */ C543811 f124565b;

                        static {
                            Covode.recordClassIndex(64085);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C54382a(C543811 r2, AbstractC89124d dVar) {
                            super(2, dVar);
                            this.f124565b = r2;
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                            C89219l.m154721d(dVar, "");
                            return new C54382a(this.f124565b, dVar);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                            return ((C54382a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final Object invokeSuspend(Object obj) {
                            if (this.f124564a == 0) {
                                C89382r.m154942a(obj);
                                new C23144b(this.f124565b.f124560a.f124559b.f124554b).mo37640e(R.string.ci1).mo37637b();
                                return C89391z.f203057a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.b$a$1$d */
                    static final class C54385d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                        /* renamed from: a */
                        int f124570a;

                        /* renamed from: b */
                        final /* synthetic */ C543811 f124571b;

                        static {
                            Covode.recordClassIndex(64088);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C54385d(C543811 r2, AbstractC89124d dVar) {
                            super(2, dVar);
                            this.f124571b = r2;
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                            C89219l.m154721d(dVar, "");
                            return new C54385d(this.f124571b, dVar);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                            return ((C54385d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final Object invokeSuspend(Object obj) {
                            if (this.f124570a == 0) {
                                C89382r.m154942a(obj);
                                new C23144b(this.f124571b.f124560a.f124559b.f124554b).mo37640e(R.string.cdy).mo37637b();
                                return C89391z.f203057a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.ui.a.b$a$1$c */
                    static final class C54384c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                        /* renamed from: a */
                        int f124568a;

                        /* renamed from: b */
                        final /* synthetic */ C543811 f124569b;

                        static {
                            Covode.recordClassIndex(64087);
                        }

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        C54384c(C543811 r2, AbstractC89124d dVar) {
                            super(2, dVar);
                            this.f124569b = r2;
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                            C89219l.m154721d(dVar, "");
                            return new C54384c(this.f124569b, dVar);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // p4600h.p4611f.p4612a.AbstractC89183m
                        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                            return ((C54384c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                        }

                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                        public final Object invokeSuspend(Object obj) {
                            if (this.f124568a == 0) {
                                C89382r.m154942a(obj);
                                UserStruct userStruct = null;
                                try {
                                    userStruct = C55257a.f126351a.queryUser(str2, str).get();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                } catch (ExecutionException e2) {
                                    e2.printStackTrace();
                                }
                                if (!(userStruct == null || userStruct.getUser() == null)) {
                                    C55085g.m100752a(IMUser.fromUser(userStruct.getUser()));
                                }
                                return C89391z.f203057a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    {
                        this.f124560a = r1;
                    }
                });
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C54379b(RecyclerView recyclerView, HandlerC53707g.AbstractC53708a aVar, C19538ai aiVar, C53709a aVar2) {
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aiVar, "");
        C89219l.m154721d(aVar2, "");
        this.f124554b = recyclerView;
        this.f124555c = aVar;
        this.f124556d = aiVar;
        this.f124557e = aVar2;
    }
}
