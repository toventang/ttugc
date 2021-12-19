package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.viewmodel;

import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.C20524n;
import com.p2082ss.android.ugc.aweme.geofencing.C52864a;
import com.p2082ss.android.ugc.aweme.settings.C68748n;
import com.p2082ss.android.ugc.aweme.shortvideo.model.AddToPlaylistItemStatus;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72683v;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel */
public final class VideoPublishViewModel extends BaseJediViewModel<VideoPublishState> {

    /* renamed from: a */
    public List<C72683v> f165708a = new ArrayList();

    /* renamed from: b */
    public C52864a f165709b;

    /* renamed from: c */
    public AddToPlaylistItemStatus f165710c;

    /* renamed from: d */
    public C2564l<Boolean> f165711d = new C2564l<>(false);

    static {
        Covode.recordClassIndex(86558);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new VideoPublishState(null, null, 3, null);
    }

    /* renamed from: a */
    public final AddToPlaylistItemStatus mo116261a() {
        AddToPlaylistItemStatus addToPlaylistItemStatus = this.f165710c;
        if (addToPlaylistItemStatus == null) {
            C89219l.m154710a("addToPlaylistItemStatus");
        }
        return addToPlaylistItemStatus;
    }

    /* renamed from: b */
    public final C52864a mo116263b() {
        C52864a aVar = this.f165709b;
        if (aVar == null) {
            C89219l.m154710a("geoFencingItemStatus");
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel$a */
    public static final class C73814a extends AbstractC89220m implements AbstractC89172b<VideoPublishState, VideoPublishState> {

        /* renamed from: a */
        final /* synthetic */ boolean f165712a;

        /* renamed from: b */
        final /* synthetic */ boolean f165713b;

        static {
            Covode.recordClassIndex(86559);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73814a(boolean z, boolean z2) {
            super(1);
            this.f165712a = z;
            this.f165713b = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ VideoPublishState invoke(VideoPublishState videoPublishState) {
            VideoPublishState videoPublishState2 = videoPublishState;
            C89219l.m154721d(videoPublishState2, "");
            return VideoPublishState.copy$default(videoPublishState2, new C20524n(new C89378p(Boolean.valueOf(this.f165712a), Boolean.valueOf(this.f165713b))), null, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel$b */
    public static final class C73815b extends AbstractC89220m implements AbstractC89172b<VideoPublishState, VideoPublishState> {

        /* renamed from: a */
        final /* synthetic */ boolean f165714a;

        /* renamed from: b */
        final /* synthetic */ boolean f165715b;

        static {
            Covode.recordClassIndex(86560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73815b(boolean z, boolean z2) {
            super(1);
            this.f165714a = z;
            this.f165715b = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ VideoPublishState invoke(VideoPublishState videoPublishState) {
            VideoPublishState videoPublishState2 = videoPublishState;
            C89219l.m154721d(videoPublishState2, "");
            return VideoPublishState.copy$default(videoPublishState2, new C20524n(new C89378p(Boolean.valueOf(this.f165714a), Boolean.valueOf(this.f165715b))), null, 2, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel$c */
    public static final class C73816c extends AbstractC89220m implements AbstractC89172b<VideoPublishState, VideoPublishState> {

        /* renamed from: a */
        final /* synthetic */ boolean f165716a;

        /* renamed from: b */
        final /* synthetic */ boolean f165717b;

        static {
            Covode.recordClassIndex(86561);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73816c(boolean z, boolean z2) {
            super(1);
            this.f165716a = z;
            this.f165717b = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ VideoPublishState invoke(VideoPublishState videoPublishState) {
            VideoPublishState videoPublishState2 = videoPublishState;
            C89219l.m154721d(videoPublishState2, "");
            return VideoPublishState.copy$default(videoPublishState2, null, new C20524n(new C89378p(Boolean.valueOf(this.f165716a), Boolean.valueOf(this.f165717b))), 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel$d */
    public static final class C73817d extends AbstractC89220m implements AbstractC89172b<VideoPublishState, VideoPublishState> {

        /* renamed from: a */
        final /* synthetic */ boolean f165718a;

        /* renamed from: b */
        final /* synthetic */ boolean f165719b;

        static {
            Covode.recordClassIndex(86562);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73817d(boolean z, boolean z2) {
            super(1);
            this.f165718a = z;
            this.f165719b = z2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ VideoPublishState invoke(VideoPublishState videoPublishState) {
            VideoPublishState videoPublishState2 = videoPublishState;
            C89219l.m154721d(videoPublishState2, "");
            return VideoPublishState.copy$default(videoPublishState2, null, new C20524n(new C89378p(Boolean.valueOf(this.f165718a), Boolean.valueOf(this.f165719b))), 1, null);
        }
    }

    /* renamed from: a */
    public final void mo116262a(boolean z, boolean z2) {
        if (C68748n.m121185a()) {
            mo33690d(new C73814a(z, z2));
        } else {
            mo33689c(new C73815b(z, z2));
        }
    }
}
