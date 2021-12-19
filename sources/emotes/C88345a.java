package emotes;

import com.bytedance.android.live.C4049d;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import emotes.model.EmoteListResult;
import emotes.model.SubEmoteDetailResult;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: emotes.a */
public final class C88345a {

    /* renamed from: a */
    public static C88411a f200548a = new C88411a();

    /* renamed from: b */
    public static boolean f200549b;

    /* renamed from: c */
    public static final C88345a f200550c = new C88345a();

    /* renamed from: emotes.a$c */
    public static final class C88348c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C88348c f200552a = new C88348c();

        static {
            Covode.recordClassIndex(104387);
        }

        C88348c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    private C88345a() {
    }

    static {
        Covode.recordClassIndex(104384);
    }

    /* renamed from: emotes.a$a */
    public static final class C88346a implements AbstractC88434g<C5832d<SubEmoteDetailResult>, C5832d<SubEmoteDetailResult>> {
        static {
            Covode.recordClassIndex(104385);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ C5832d<SubEmoteDetailResult> apply(C5832d<SubEmoteDetailResult> dVar) {
            C5832d<SubEmoteDetailResult> dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            if (dVar2.data != null) {
                Object obj = dVar2.data;
                C89219l.m154716b(obj, "");
                if (((SubEmoteDetailResult) obj).getStableEmoteDetail() != null) {
                    Object obj2 = dVar2.data;
                    C89219l.m154716b(obj2, "");
                    EmoteListResult stableEmoteDetail = ((SubEmoteDetailResult) obj2).getStableEmoteDetail();
                    C89219l.m154716b(stableEmoteDetail, "");
                    if (stableEmoteDetail.getEmoteList() != null) {
                        if (dVar2.data != null) {
                            Object obj3 = dVar2.data;
                            C89219l.m154716b(obj3, "");
                            if (((SubEmoteDetailResult) obj3).getStableEmoteDetail() != null) {
                                Object obj4 = dVar2.data;
                                C89219l.m154716b(obj4, "");
                                EmoteListResult stableEmoteDetail2 = ((SubEmoteDetailResult) obj4).getStableEmoteDetail();
                                C89219l.m154716b(stableEmoteDetail2, "");
                                if (stableEmoteDetail2.getEmoteList() != null) {
                                    Object obj5 = dVar2.data;
                                    C89219l.m154716b(obj5, "");
                                    EmoteListResult stableEmoteDetail3 = ((SubEmoteDetailResult) obj5).getStableEmoteDetail();
                                    C89219l.m154716b(stableEmoteDetail3, "");
                                    for (EmoteModel emoteModel : stableEmoteDetail3.getEmoteList()) {
                                        C89219l.m154716b(emoteModel, "");
                                        if (emoteModel.f8728h != null) {
                                            emoteModel.f8733m = C7577g.m15577c(emoteModel.f8728h);
                                        }
                                    }
                                }
                            }
                        }
                        if (dVar2.data != null) {
                            Object obj6 = dVar2.data;
                            C89219l.m154716b(obj6, "");
                            if (((SubEmoteDetailResult) obj6).getEmoteConfig() != null) {
                                Object obj7 = dVar2.data;
                                C89219l.m154716b(obj7, "");
                                if (((SubEmoteDetailResult) obj7).getEmoteConfig().f8741b != null) {
                                    Object obj8 = dVar2.data;
                                    C89219l.m154716b(obj8, "");
                                    for (EmoteModel emoteModel2 : ((SubEmoteDetailResult) obj8).getEmoteConfig().f8741b) {
                                        C89219l.m154716b(emoteModel2, "");
                                        if (emoteModel2.f8728h != null) {
                                            emoteModel2.f8733m = C7577g.m15577c(emoteModel2.f8728h);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return dVar2;
        }
    }

    /* renamed from: emotes.a$b */
    public static final class C88347b<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C88347b f200551a = new C88347b();

        static {
            Covode.recordClassIndex(104386);
        }

        C88347b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C5832d dVar = (C5832d) obj;
            if (C88345a.f200549b) {
                ArrayList arrayList = new ArrayList();
                if (dVar != null) {
                    if (dVar.data != null) {
                        Object obj2 = dVar.data;
                        C89219l.m154716b(obj2, "");
                        if (((SubEmoteDetailResult) obj2).getStableEmoteDetail() != null) {
                            Object obj3 = dVar.data;
                            C89219l.m154716b(obj3, "");
                            EmoteListResult stableEmoteDetail = ((SubEmoteDetailResult) obj3).getStableEmoteDetail();
                            C89219l.m154716b(stableEmoteDetail, "");
                            if (stableEmoteDetail.getEmoteList() != null) {
                                Object obj4 = dVar.data;
                                C89219l.m154716b(obj4, "");
                                EmoteListResult stableEmoteDetail2 = ((SubEmoteDetailResult) obj4).getStableEmoteDetail();
                                C89219l.m154716b(stableEmoteDetail2, "");
                                List<EmoteModel> emoteList = stableEmoteDetail2.getEmoteList();
                                C89219l.m154716b(emoteList, "");
                                arrayList.addAll(emoteList);
                            }
                        }
                    }
                    if (dVar.data != null) {
                        Object obj5 = dVar.data;
                        C89219l.m154716b(obj5, "");
                        if (((SubEmoteDetailResult) obj5).getEmoteConfig() != null) {
                            Object obj6 = dVar.data;
                            C89219l.m154716b(obj6, "");
                            if (((SubEmoteDetailResult) obj6).getEmoteConfig().f8741b != null) {
                                Object obj7 = dVar.data;
                                C89219l.m154716b(obj7, "");
                                List<EmoteModel> list = ((SubEmoteDetailResult) obj7).getEmoteConfig().f8741b;
                                C89219l.m154716b(list, "");
                                arrayList.addAll(list);
                            }
                        }
                    }
                }
                DataChannelGlobal.f42558d.mo28325b(C4049d.class, arrayList);
            }
        }
    }
}
