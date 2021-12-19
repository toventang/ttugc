package com.p2082ss.android.ugc.aweme.story.record.recordcontrol;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14207x;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import com.p2082ss.android.ugc.aweme.story.record.p4061a.C77467b;
import com.p2082ss.android.ugc.aweme.story.record.p4066f.C77561a;
import com.p2082ss.android.ugc.aweme.story.record.p4068h.AbstractC77583a;
import com.p2082ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.vesdk.C85346av;
import java.lang.reflect.Type;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.e */
public final class C77625e extends C74172g<AbstractC14193m> {

    /* renamed from: q */
    static final /* synthetic */ AbstractC89286i[] f174114q = {new C89232y(C77625e.class, "cameraApiComponent", "getCameraApiComponent()Lcom/ss/android/ugc/aweme/story/record/camera/StoryCameraCoreComponent;", 0), new C89232y(C77625e.class, "recordComponent", "getRecordComponent()Lcom/ss/android/ugc/aweme/story/record/recordcontrol/StoryRecordControlComponent;", 0), new C89232y(C77625e.class, "recordContext", "getRecordContext()Lcom/ss/android/ugc/aweme/story/record/model/StoryRecordContext;", 0)};

    /* renamed from: r */
    private final AbstractC89248d f174115r = C21572a.m40504a(getDiContainer(), C77467b.class);

    /* renamed from: s */
    private final AbstractC89248d f174116s = C21572a.m40504a(getDiContainer(), C77625e.class);

    /* renamed from: t */
    private final AbstractC89248d f174117t = C21572a.m40504a(getDiContainer(), C77561a.class);

    static {
        Covode.recordClassIndex(90664);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.e$c */
    static final class C77628c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C77625e f174121a;

        static {
            Covode.recordClassIndex(90667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77628c(C77625e eVar) {
            super(0);
            this.f174121a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return ((AbstractC77583a) this.f174121a.getDiContainer().mo35249a((Type) AbstractC77583a.class, (String) null)).mo121141a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.e$a */
    static final class C77626a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77625e f174118a;

        /* renamed from: b */
        final /* synthetic */ int f174119b;

        static {
            Covode.recordClassIndex(90665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77626a(C77625e eVar, int i) {
            super(0);
            this.f174118a = eVar;
            this.f174119b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            int i = this.f174119b;
            if (i == 1022) {
                C14207x xVar = new C14207x("stop record when stopPreview");
                xVar.f34485a = 3;
                C77625e eVar = this.f174118a;
                C89219l.m154716b(xVar, "");
                eVar.mo22889b(xVar);
                this.f174118a.mo22879a(xVar);
            } else if (i == 1080) {
                C77625e eVar2 = this.f174118a;
                eVar2.f166636j = eVar2.mo116643H().mo22751E().mo122463a();
                this.f174118a.getApiComponent().mo22918y();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        mo116643H().mo22747A().mo56916a(new C77627b(this));
        Activity b = C2556g.m7473b(this);
        Objects.requireNonNull(b, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC89248d dVar = this.f174115r;
        AbstractC89286i<?>[] iVarArr = f174114q;
        Object a = getDiContainer().mo35247a(AbstractC14330a.class);
        C89219l.m154716b(a, "");
        mo22884a(StoryRecordNextAction.C77611a.class, new StoryRecordNextAction((ActivityC0945e) b, (C77467b) dVar.mo23374a(this, iVarArr[0]), (AbstractC14330a) a, (C77561a) this.f174117t.mo23374a(this, iVarArr[2]), ((C74172g) this.f174116s.mo23374a(this, iVarArr[1])).f166637k, new C77628c(this)));
        mo22882a(StoryRecordNextAction.C77611a.class);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77625e(C21582f fVar, AbstractC89172b<? super C74172g.C74180b, C89391z> bVar) {
        super(fVar, bVar);
        C89219l.m154721d(fVar, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.story.record.recordcontrol.e$b */
    static final class C77627b extends AbstractC89220m implements AbstractC89188r<Integer, Integer, String, C85346av, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C77625e f174120a;

        static {
            Covode.recordClassIndex(90666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77627b(C77625e eVar) {
            super(4);
            this.f174120a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(Integer num, Integer num2, String str, C85346av avVar) {
            int intValue = num.intValue();
            C89219l.m154721d(avVar, "");
            C80558hx.m139642a(0, new C77626a(this.f174120a, intValue));
            return C89391z.f203057a;
        }
    }
}
