package com.p2082ss.android.ugc.gamora.editor.sticker.read;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20379aq;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20524n;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import java.io.File;
import java.util.List;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextViewModel */
public final class ReadTextViewModel extends BaseJediViewModel<ReadTextState> {

    /* renamed from: a */
    public final AbstractC89244h f185459a = C89250i.m154777a(new ReadTextApi());

    /* renamed from: b */
    public final C88411a f185460b = new C88411a();

    /* renamed from: c */
    public long f185461c;

    static {
        Covode.recordClassIndex(96877);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new ReadTextState(C20379aq.f48273a, null, null);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextViewModel$e */
    public static final class C83010e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ReadTextViewModel f185472a;

        /* renamed from: b */
        final /* synthetic */ String f185473b;

        static {
            Covode.recordClassIndex(96882);
        }

        public C83010e(ReadTextViewModel readTextViewModel, String str) {
            this.f185472a = readTextViewModel;
            this.f185473b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f185472a.mo128086a(this.f185473b, -1);
        }
    }

    /* renamed from: a */
    public final void mo128085a(C20391d<TextStickerData> dVar) {
        C89219l.m154721d(dVar, "");
        mo33689c(new C83011f(dVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextViewModel$f */
    public static final class C83011f extends AbstractC89220m implements AbstractC89172b<ReadTextState, ReadTextState> {

        /* renamed from: a */
        final /* synthetic */ C20391d f185474a;

        static {
            Covode.recordClassIndex(96883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83011f(C20391d dVar) {
            super(1);
            this.f185474a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ReadTextState invoke(ReadTextState readTextState) {
            ReadTextState readTextState2 = readTextState;
            C89219l.m154721d(readTextState2, "");
            return ReadTextState.copy$default(readTextState2, null, this.f185474a, null, 5, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextViewModel$a */
    public static final class C83006a extends AbstractC89220m implements AbstractC89172b<ReadTextState, ReadTextState> {

        /* renamed from: a */
        final /* synthetic */ String f185462a;

        /* renamed from: b */
        final /* synthetic */ int f185463b;

        static {
            Covode.recordClassIndex(96878);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83006a(String str, int i) {
            super(1);
            this.f185462a = str;
            this.f185463b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ReadTextState invoke(ReadTextState readTextState) {
            ReadTextState readTextState2 = readTextState;
            C89219l.m154721d(readTextState2, "");
            return ReadTextState.copy$default(readTextState2, null, null, new C20524n(C89387v.m154943a(this.f185462a, Integer.valueOf(this.f185463b))), 3, null);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextViewModel$b */
    static final class C83007b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ String f185464a;

        /* renamed from: b */
        final /* synthetic */ TextStickerData f185465b;

        /* renamed from: c */
        final /* synthetic */ String f185466c;

        static {
            Covode.recordClassIndex(96879);
        }

        C83007b(String str, TextStickerData textStickerData, String str2) {
            this.f185464a = str;
            this.f185465b = textStickerData;
            this.f185466c = str2;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<TextStickerData> vVar) {
            C89219l.m154721d(vVar, "");
            File b = C83065i.m143415b(this.f185464a);
            if (b == null || !b.exists()) {
                vVar.mo143104b(new IllegalStateException("File not exists"));
                return;
            }
            this.f185465b.setAudioTrackDuration(C80418fa.m139406a(b.getAbsolutePath()));
            this.f185465b.setAudioTrackFilePath(b.getAbsolutePath());
            List<String> audioPathList = this.f185465b.getAudioPathList();
            String absolutePath = b.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            audioPathList.add(absolutePath);
            this.f185465b.setAudioText(this.f185466c);
            if (!vVar.isDisposed()) {
                vVar.mo143031a(this.f185465b);
                vVar.mo143023a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextViewModel$d */
    public static final class C83009d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ReadTextViewModel f185468a;

        /* renamed from: b */
        final /* synthetic */ TextStickerData f185469b;

        /* renamed from: c */
        final /* synthetic */ String f185470c;

        /* renamed from: d */
        final /* synthetic */ String f185471d;

        static {
            Covode.recordClassIndex(96881);
        }

        public C83009d(ReadTextViewModel readTextViewModel, TextStickerData textStickerData, String str, String str2) {
            this.f185468a = readTextViewModel;
            this.f185469b = textStickerData;
            this.f185470c = str;
            this.f185471d = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            FetchTextAudioResponse fetchTextAudioResponse = (FetchTextAudioResponse) obj;
            if (fetchTextAudioResponse.status_code == 0 && fetchTextAudioResponse.getData() != null) {
                String audio = fetchTextAudioResponse.getData().getAudio();
                if (audio != null && audio.length() > 0) {
                    ReadTextViewModel readTextViewModel = this.f185468a;
                    AbstractC88979t<T> a = AbstractC88979t.m154294a(new C83007b(audio, this.f185469b, this.f185470c)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a));
                    C89219l.m154716b(a, "");
                    readTextViewModel.f185460b.mo142945a(readTextViewModel.mo33682a(a, new C83008c(readTextViewModel)));
                }
            } else if (fetchTextAudioResponse.status_code != 0) {
                ReadTextViewModel readTextViewModel2 = this.f185468a;
                String str = fetchTextAudioResponse.message;
                if (str == null) {
                    str = this.f185471d;
                }
                readTextViewModel2.mo128086a(str, fetchTextAudioResponse.status_code);
            }
        }
    }

    /* renamed from: a */
    public final void mo128086a(String str, int i) {
        C89219l.m154721d(str, "");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("duration", currentTimeMillis - this.f185461c);
        C40982q.m82523a("edit_text_read_request", jSONObject, new C69840ar().mo110187a("code", Integer.valueOf(i)).mo110191a());
        mo33689c(new C83006a(str, i));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.sticker.read.ReadTextViewModel$c */
    static final class C83008c extends AbstractC89220m implements AbstractC89183m<ReadTextState, AbstractC20362a<? extends TextStickerData>, ReadTextState> {

        /* renamed from: a */
        final /* synthetic */ ReadTextViewModel f185467a;

        static {
            Covode.recordClassIndex(96880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83008c(ReadTextViewModel readTextViewModel) {
            super(2);
            this.f185467a = readTextViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ ReadTextState invoke(ReadTextState readTextState, AbstractC20362a<? extends TextStickerData> aVar) {
            ReadTextState readTextState2 = readTextState;
            AbstractC20362a<? extends TextStickerData> aVar2 = aVar;
            C89219l.m154721d(readTextState2, "");
            C89219l.m154721d(aVar2, "");
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", currentTimeMillis - this.f185467a.f185461c);
            C40982q.m82523a("edit_text_read_request", jSONObject, new C69840ar().mo110187a("code", (Integer) 0).mo110191a());
            return ReadTextState.copy$default(readTextState2, aVar2, null, null, 6, null);
        }
    }
}
