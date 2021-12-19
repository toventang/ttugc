package com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3829d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71493a;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.C71494b;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71428c;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3828c.AbstractC71432a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.VERecordData;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.d */
public final class C71442d {

    /* renamed from: a */
    AbstractC31071f f160074a;

    /* renamed from: b */
    public AbstractC71432a f160075b;

    static {
        Covode.recordClassIndex(83976);
    }

    /* renamed from: a */
    public final void mo113060a() {
        AbstractC31071f fVar = this.f160074a;
        if (fVar != null) {
            fVar.mo56388t();
        }
        AbstractC71432a aVar = this.f160075b;
        if (aVar != null) {
            aVar.mo113038a();
        }
    }

    /* renamed from: b */
    public final void mo113069b() {
        AbstractC31071f fVar = this.f160074a;
        if (fVar != null) {
            fVar.mo56390u();
        }
        AbstractC71432a aVar = this.f160075b;
        if (aVar != null) {
            aVar.mo113039b();
        }
    }

    /* renamed from: c */
    public final void mo113071c() {
        AbstractC31071f fVar = this.f160074a;
        if (fVar != null) {
            fVar.mo56311a(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo113072d() {
        AbstractC31071f fVar;
        AbstractC31071f fVar2 = this.f160074a;
        if (fVar2 != null) {
            fVar2.mo56280a(C85581w.EnumC85606e.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE);
        }
        if (C71428c.m126150a() && (fVar = this.f160074a) != null) {
            fVar.mo56343c(C71494b.f160203e, C71494b.f160204f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo113073e() {
        AbstractC31071f fVar;
        if (C71428c.m126151b() && (fVar = this.f160074a) != null) {
            fVar.mo56303a(C71494b.f160199a, C71494b.f160200b, C71494b.f160201c, C71494b.f160202d);
        }
    }

    /* renamed from: a */
    public final void mo113063a(AbstractC31071f fVar) {
        if (this.f160074a == null) {
            this.f160074a = fVar;
            if (fVar != null) {
                fVar.mo56344c(new C71443a(this));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo113070b(MultiEditVideoRecordData multiEditVideoRecordData) {
        AbstractC31071f fVar;
        if (multiEditVideoRecordData != null) {
            if (!C69823b.m123388a(multiEditVideoRecordData.musicPath, C63247i.f143610a)) {
                AbstractC31071f fVar2 = this.f160074a;
                if (fVar2 != null) {
                    fVar2.mo56313a(0, 0, multiEditVideoRecordData.originVolume);
                    return;
                }
                return;
            }
            multiEditVideoRecordData.musicDuration = C80418fa.m139406a(multiEditVideoRecordData.musicPath);
            AbstractC31071f fVar3 = this.f160074a;
            if (fVar3 != null) {
                String str = multiEditVideoRecordData.musicPath;
                C89219l.m154716b(str, "");
                int a = fVar3.mo56287a(str, multiEditVideoRecordData.musicTrimIn, multiEditVideoRecordData.musicDuration, multiEditVideoRecordData.isSoundLoop);
                AbstractC31071f fVar4 = this.f160074a;
                if (fVar4 != null) {
                    fVar4.mo56313a(a, 1, multiEditVideoRecordData.musicVolume);
                }
                if (a > 0 && (fVar = this.f160074a) != null) {
                    fVar.mo56313a(0, 0, multiEditVideoRecordData.originVolume);
                }
                multiEditVideoRecordData.musicIndex = a;
            }
        }
    }

    /* renamed from: a */
    public final void mo113064a(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            AbstractC31071f fVar = this.f160074a;
            if (fVar != null) {
                fVar.mo56385r();
            }
            VERecordData a = C71493a.m126273a(multiEditVideoRecordData);
            Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
            a.mo130356a(((long) ((Integer) playInOutTime.first).intValue()) * 1000, ((long) ((Integer) playInOutTime.second).intValue()) * 1000);
            AbstractC31071f fVar2 = this.f160074a;
            if (fVar2 != null) {
                int unused = fVar2.mo56276a(a, false, true);
            }
            mo113070b(multiEditVideoRecordData);
            AbstractC31071f fVar3 = this.f160074a;
            if (fVar3 != null) {
                fVar3.mo56311a(true);
            }
            mo113072d();
            AbstractC31071f fVar4 = this.f160074a;
            if (fVar4 != null) {
                fVar4.mo56381p();
            }
            mo113073e();
            AbstractC31071f fVar5 = this.f160074a;
            if (fVar5 != null) {
                fVar5.mo56265a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
            }
        }
    }

    /* renamed from: a */
    public final void mo113062a(long j, C85581w.EnumC85607f fVar) {
        C89219l.m154721d(fVar, "");
        AbstractC31071f fVar2 = this.f160074a;
        if (fVar2 != null) {
            fVar2.mo56265a((int) j, fVar);
        }
    }

    /* renamed from: a */
    public final void mo113068a(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData2 != null) {
            Pair<Integer, Integer> playInOutTime = multiEditVideoRecordData.getPlayInOutTime();
            Integer num = (Integer) playInOutTime.first;
            Integer num2 = (Integer) playInOutTime.second;
            AbstractC31071f fVar = this.f160074a;
            if (fVar != null) {
                fVar.mo56385r();
            }
            AbstractC31071f fVar2 = this.f160074a;
            if (fVar2 != null) {
                int unused = fVar2.mo56276a(C71493a.m126273a(multiEditVideoRecordData2), false, true);
            }
            mo113070b(multiEditVideoRecordData);
            float f = 1.0f;
            if (multiEditVideoRecordData.isSingleVideo) {
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = multiEditVideoRecordData.segmentDataList.get(0);
                C89219l.m154716b(multiEditVideoSegmentRecordData, "");
                f = multiEditVideoSegmentRecordData.getVideoSpeed();
            }
            mo113065a(multiEditVideoRecordData, (int) (((float) num.intValue()) / f), (int) (((float) num2.intValue()) / f));
            AbstractC31071f fVar3 = this.f160074a;
            if (fVar3 != null) {
                fVar3.mo56311a(true);
            }
            mo113072d();
            AbstractC31071f fVar4 = this.f160074a;
            if (fVar4 != null) {
                fVar4.mo56381p();
            }
            mo113073e();
            C89219l.m154716b(num, "");
            int intValue = num.intValue();
            C89219l.m154716b(num2, "");
            mo113061a(intValue, num2.intValue(), f);
            AbstractC31071f fVar5 = this.f160074a;
            if (fVar5 != null) {
                fVar5.mo56390u();
            }
            mo113062a((long) (((float) num.intValue()) / f), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    /* renamed from: a */
    public final void mo113061a(int i, int i2, float f) {
        AbstractC31071f fVar = this.f160074a;
        if (fVar != null) {
            if (((float) i2) > ((float) fVar.mo56368j()) * f) {
                i2 = (int) (((float) fVar.mo56368j()) * f);
            }
            fVar.mo56323b(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo113065a(MultiEditVideoRecordData multiEditVideoRecordData, int i, int i2) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData.musicIndex != -1) {
            AbstractC31071f fVar = this.f160074a;
            if (fVar != null && i2 > fVar.mo56368j()) {
                i2 = fVar.mo56368j();
            }
            int i3 = i2 - i;
            if (i3 > multiEditVideoRecordData.musicDuration) {
                i3 = multiEditVideoRecordData.musicDuration;
            }
            AbstractC31071f fVar2 = this.f160074a;
            if (fVar2 != null) {
                fVar2.mo56256a(multiEditVideoRecordData.musicIndex, multiEditVideoRecordData.musicTrimIn, multiEditVideoRecordData.musicTrimIn + i3, i, i + i3, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.d$a */
    public static final class C71443a implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ C71442d f160076a;

        static {
            Covode.recordClassIndex(83977);
        }

        C71443a(C71442d dVar) {
            this.f160076a = dVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            AbstractC71432a aVar;
            if (i == 4101 && (aVar = this.f160076a.f160075b) != null) {
                aVar.mo113040c();
            }
        }
    }

    /* renamed from: a */
    public final void mo113066a(MultiEditVideoRecordData multiEditVideoRecordData, int i, int i2, int i3) {
        if (multiEditVideoRecordData != null && multiEditVideoRecordData.musicIndex != -1) {
            int i4 = i + multiEditVideoRecordData.musicTrimIn;
            if (i4 > multiEditVideoRecordData.musicDuration) {
                i4 %= multiEditVideoRecordData.musicDuration;
            }
            AbstractC31071f fVar = this.f160074a;
            if (fVar != null) {
                fVar.mo56256a(multiEditVideoRecordData.musicIndex, i4, i4 + i3, i2, i2 + i3, false);
            }
        }
    }

    /* renamed from: a */
    public final void mo113067a(MultiEditVideoRecordData multiEditVideoRecordData, VideoSegment videoSegment, Pair<Integer, Integer> pair, boolean z, boolean z2) {
        boolean z3;
        C89219l.m154721d(pair, "");
        if (multiEditVideoRecordData != null && videoSegment != null && !C84904k.m145909a(multiEditVideoRecordData.segmentDataList)) {
            if (z || z2) {
                z3 = false;
            } else {
                z3 = true;
            }
            AbstractC31071f fVar = this.f160074a;
            if (fVar != null) {
                fVar.mo56385r();
            }
            VERecordData a = C71493a.m126273a(multiEditVideoRecordData);
            Integer num = (Integer) pair.first;
            Integer num2 = (Integer) pair.second;
            if (!z3) {
                a.mo130356a(((long) num.intValue()) * 1000, ((long) num2.intValue()) * 1000);
            }
            AbstractC31071f fVar2 = this.f160074a;
            if (fVar2 != null) {
                int unused = fVar2.mo56276a(a, false, true);
            }
            mo113070b(multiEditVideoRecordData);
            AbstractC31071f fVar3 = this.f160074a;
            if (fVar3 != null) {
                fVar3.mo56311a(true);
            }
            mo113072d();
            AbstractC31071f fVar4 = this.f160074a;
            if (fVar4 != null) {
                fVar4.mo56381p();
            }
            mo113073e();
            if (z3) {
                AbstractC31071f fVar5 = this.f160074a;
                if (fVar5 != null) {
                    C89219l.m154716b(num, "");
                    int intValue = num.intValue();
                    C89219l.m154716b(num2, "");
                    fVar5.mo56323b(intValue, num2.intValue());
                }
                AbstractC31071f fVar6 = this.f160074a;
                if (fVar6 != null) {
                    C89219l.m154716b(num, "");
                    fVar6.mo56265a(num.intValue(), C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
                    return;
                }
                return;
            }
            AbstractC31071f fVar7 = this.f160074a;
            if (fVar7 != null) {
                fVar7.mo56265a(0, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
            }
        }
    }
}
