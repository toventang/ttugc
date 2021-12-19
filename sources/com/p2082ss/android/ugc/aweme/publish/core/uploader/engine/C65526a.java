package com.p2082ss.android.ugc.aweme.publish.core.uploader.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65448ed;
import com.p2082ss.android.ugc.aweme.publish.core.uploader.p3615a.C65525a;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65611c;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65613e;
import com.p2082ss.android.ugc.aweme.publish.p3619f.C65614f;
import com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65666a;
import com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b;
import com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65672c;
import com.p2082ss.android.ugc.aweme.publish.p3625i.C65675d;
import com.p2082ss.android.ugc.aweme.shortvideo.upload.C73844ad;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.bduploader.BDExternalFileReader;
import com.p2082ss.bduploader.BDUploadResolver;
import com.p2082ss.bduploader.BDVideoInfo;
import com.p2082ss.bduploader.BDVideoUploader;
import com.p2082ss.bduploader.BDVideoUploaderListener;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.a */
public final class C65526a extends AbstractC65668b {

    /* renamed from: a */
    public static final C65527a f147761a = new C65527a((byte) 0);

    /* renamed from: c */
    private BDVideoUploader f147762c;

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.a$a */
    public static final class C65527a {
        static {
            Covode.recordClassIndex(77017);
        }

        private C65527a() {
        }

        public /* synthetic */ C65527a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: a */
    public final void mo104660a() {
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.setPrivateVideo(true);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: b */
    public final void mo104667b() {
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.cancelUpload();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: c */
    public final void mo104669c() {
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.start();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: d */
    public final void mo104671d() {
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.close();
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: e */
    public final void mo104673e() {
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.allowMergeUpload();
    }

    static {
        Covode.recordClassIndex(77016);
        C65525a.m117255a();
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.a$b */
    public static final class C65528b implements BDExternalFileReader {

        /* renamed from: a */
        final /* synthetic */ AbstractC65666a f147763a;

        static {
            Covode.recordClassIndex(77018);
        }

        @Override // com.p2082ss.bduploader.BDExternalFileReader
        public final void cancel() {
        }

        C65528b(AbstractC65666a aVar) {
            this.f147763a = aVar;
        }

        @Override // com.p2082ss.bduploader.BDExternalFileReader
        public final long getValue(int i) {
            if (i == 0) {
                return this.f147763a.mo104837a(0);
            }
            if (i != 2) {
                return -1;
            }
            return this.f147763a.mo104837a(1);
        }

        @Override // com.p2082ss.bduploader.BDExternalFileReader
        public final long getCrc32ByOffset(long j, int i) {
            return this.f147763a.mo104838a(j, i);
        }

        @Override // com.p2082ss.bduploader.BDExternalFileReader
        public final int readSlice(int i, byte[] bArr, int i2) {
            AbstractC65666a aVar = this.f147763a;
            if (bArr == null) {
                bArr = new byte[0];
            }
            return aVar.mo104835a(i, bArr, i2);
        }

        @Override // com.p2082ss.bduploader.BDExternalFileReader
        public final int readSliceByOffset(long j, byte[] bArr, int i, int i2) {
            return this.f147763a.mo104836a(j, bArr, i, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.publish.core.uploader.engine.a$c */
    public static final class C65529c implements BDVideoUploaderListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC65672c f147764a;

        static {
            Covode.recordClassIndex(77019);
        }

        C65529c(AbstractC65672c cVar) {
            this.f147764a = cVar;
        }

        @Override // com.p2082ss.bduploader.BDVideoUploaderListener
        public final String getStringFromExtern(int i) {
            String b = this.f147764a.mo104843b();
            if (b == null) {
                return "";
            }
            return b;
        }

        @Override // com.p2082ss.bduploader.BDVideoUploaderListener
        public final void onUploadVideoStage(int i, long j) {
            this.f147764a.mo104840a(i);
        }

        @Override // com.p2082ss.bduploader.BDVideoUploaderListener
        public final int videoUploadCheckNetState(int i, int i2) {
            return this.f147764a.mo104839a();
        }

        @Override // com.p2082ss.bduploader.BDVideoUploaderListener
        public final void onLog(int i, int i2, String str) {
            if (i == 100) {
                this.f147764a.mo104841a(101, i2, str);
            } else if (i == 101) {
                this.f147764a.mo104841a(100, i2, str);
            }
        }

        @Override // com.p2082ss.bduploader.BDVideoUploaderListener
        public final void onNotify(int i, long j, BDVideoInfo bDVideoInfo) {
            C65675d dVar;
            long j2;
            if (bDVideoInfo == null) {
                Long l = -2147483648L;
                if (l != null) {
                    j2 = l.longValue();
                } else {
                    j2 = 0;
                }
                dVar = new C65675d((String) null, (String) null, (String) null, 0, j2, (String) null, (String) null, (String) null, 479);
            } else {
                dVar = new C65675d(bDVideoInfo.mVideoId, bDVideoInfo.mCoverUri, bDVideoInfo.mTosKey, bDVideoInfo.mLog, bDVideoInfo.mProgress, bDVideoInfo.mErrorCode, bDVideoInfo.mErrorMsg, bDVideoInfo.mVideoMediaInfo, bDVideoInfo.mEncryptionMeta);
            }
            if (i == 0) {
                this.f147764a.mo104842a(1, j, dVar);
            } else if (i == 1) {
                this.f147764a.mo104842a(3, j, dVar);
            } else if (i == 2) {
                this.f147764a.mo104842a(2, j, dVar);
            } else if (i == 3) {
                this.f147764a.mo104842a(4, j, dVar);
            } else if (i == 121 && SettingsManager.m29616a().mo25400a("enable_deal_uploader_user_cancel", true)) {
                this.f147764a.mo104842a(4, j, dVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: a */
    public final void mo104661a(float f) {
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.setPoster(f);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: b */
    public final void mo104668b(int i) {
        if (i > 0) {
            BDVideoUploader bDVideoUploader = this.f147762c;
            if (bDVideoUploader == null) {
                C89219l.m154710a("mActualUploader");
            }
            bDVideoUploader.setSpeedTestThresh(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: c */
    public final void mo104670c(int i) {
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.setSocketNum(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: d */
    public final void mo104672d(int i) {
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.setSliceSize(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: e */
    public final void mo104674e(int i) {
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.setPreUploadEncryptionMode(i);
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: a */
    public final void mo104662a(int i) {
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.setScenesTag(String.valueOf(i));
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: a */
    public final void mo104664a(AbstractC65666a aVar) {
        C89219l.m154721d(aVar, "");
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.setExternFileReader(new C65528b(aVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: a */
    public final void mo104665a(AbstractC65672c cVar) {
        C89219l.m154721d(cVar, "");
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.setListener(new C65529c(cVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: a */
    public final void mo104663a(C65611c cVar) {
        C89219l.m154721d(cVar, "");
        C65614f fVar = cVar.f147851a;
        if (fVar != null) {
            C89219l.m154716b(fVar, "");
            C65614f.C65615a aVar = fVar.f147883F;
            if (aVar != null) {
                C89219l.m154716b(aVar, "");
                BDVideoUploader bDVideoUploader = new BDVideoUploader();
                this.f147762c = bDVideoUploader;
                bDVideoUploader.setTopAccessKey(aVar.f147912a);
                BDVideoUploader bDVideoUploader2 = this.f147762c;
                if (bDVideoUploader2 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader2.setTopSecretKey(aVar.f147913b);
                BDVideoUploader bDVideoUploader3 = this.f147762c;
                if (bDVideoUploader3 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader3.setTopSessionToken(aVar.f147914c);
                BDVideoUploader bDVideoUploader4 = this.f147762c;
                if (bDVideoUploader4 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader4.setSpaceName(aVar.f147915d);
                BDVideoUploader bDVideoUploader5 = this.f147762c;
                if (bDVideoUploader5 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader5.setEnableLogCallBack(fVar.f147906u);
                BDVideoUploader bDVideoUploader6 = this.f147762c;
                if (bDVideoUploader6 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader6.setMaxFailTime(fVar.f147893h);
                C84911q.m145922a("UploadSmartSlice", "default slice size = " + fVar.f147891f);
                BDVideoUploader bDVideoUploader7 = this.f147762c;
                if (bDVideoUploader7 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader7.setSliceSize(fVar.f147891f);
                BDVideoUploader bDVideoUploader8 = this.f147762c;
                if (bDVideoUploader8 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader8.setUploadDomain(fVar.f147888c);
                BDVideoUploader bDVideoUploader9 = this.f147762c;
                if (bDVideoUploader9 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader9.setRWTimeout(fVar.f147889d);
                BDVideoUploader bDVideoUploader10 = this.f147762c;
                if (bDVideoUploader10 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader10.setSliceReTryCount(fVar.f147890e);
                BDVideoUploader bDVideoUploader11 = this.f147762c;
                if (bDVideoUploader11 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader11.setFileRetryCount(fVar.f147892g);
                BDVideoUploader bDVideoUploader12 = this.f147762c;
                if (bDVideoUploader12 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader12.setSocketNum(1);
                BDVideoUploader bDVideoUploader13 = this.f147762c;
                if (bDVideoUploader13 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader13.setAliveMaxFailTime(fVar.f147897l);
                BDVideoUploader bDVideoUploader14 = this.f147762c;
                if (bDVideoUploader14 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader14.setTcpOpenTimeOutMilliSec(fVar.f147900o);
                BDVideoUploader bDVideoUploader15 = this.f147762c;
                if (bDVideoUploader15 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader15.setResponseTimeOut(C16048b.m29633a().mo25412a(true, "tt_uploader_response_time_out", 0));
                BDVideoUploader bDVideoUploader16 = this.f147762c;
                if (bDVideoUploader16 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader16.setEnableExternDNS(fVar.f147896k);
                int a = C16048b.m29633a().mo25412a(true, "tool_upload_sdk_max_speed_thres", 0);
                if (a > 0) {
                    BDVideoUploader bDVideoUploader17 = this.f147762c;
                    if (bDVideoUploader17 == null) {
                        C89219l.m154710a("mActualUploader");
                    }
                    bDVideoUploader17.setMaxUploadSpeedThresh(a);
                }
                BDUploadResolver.setEnableTTNetDNS(fVar.f147898m);
                C65613e eVar = cVar.f147852b;
                if (eVar != null) {
                    BDUploadResolver.setDNSType(eVar.f147871f, eVar.f147872g, eVar.f147873h, eVar.f147874i, eVar.f147875j);
                    BDUploadResolver.setDNSServer(eVar.f147876k, eVar.f147877l);
                }
                BDVideoUploader bDVideoUploader18 = this.f147762c;
                if (bDVideoUploader18 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                C73844ad adVar = new C73844ad();
                adVar.mo116304b();
                adVar.mo116303a(fVar);
                bDVideoUploader18.setServerParameter(adVar.mo116301a() + C65448ed.m117169a());
                BDVideoUploader bDVideoUploader19 = this.f147762c;
                if (bDVideoUploader19 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader19.setEnableHttps(fVar.f147895j);
                boolean n = C63244g.m114602a().mo73295w().mo93785n();
                BDVideoUploader bDVideoUploader20 = this.f147762c;
                if (bDVideoUploader20 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader20.setOpenBoe(n);
                C84911q.m145921a("BDVideoUploader enableBoe:".concat(String.valueOf(n)));
                int a2 = C65525a.m117254a(fVar.f147884G);
                int a3 = C65525a.m117254a(fVar.f147885H);
                C84911q.m145922a("AbstractPublishUploader", "mainNetworkType=" + a2 + ", backupNetworkType=" + a3);
                BDVideoUploader bDVideoUploader21 = this.f147762c;
                if (bDVideoUploader21 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader21.setNetworkType(403, a2);
                BDVideoUploader bDVideoUploader22 = this.f147762c;
                if (bDVideoUploader22 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader22.setNetworkType(404, a3);
                if (fVar.f147903r == 1) {
                    BDVideoUploader bDVideoUploader23 = this.f147762c;
                    if (bDVideoUploader23 == null) {
                        C89219l.m154710a("mActualUploader");
                    }
                    bDVideoUploader23.setDataTransportProtocol(2);
                    return;
                }
                BDVideoUploader bDVideoUploader24 = this.f147762c;
                if (bDVideoUploader24 == null) {
                    C89219l.m154710a("mActualUploader");
                }
                bDVideoUploader24.setDataTransportProtocol(0);
                return;
            }
            throw new IllegalArgumentException("upload video authorization2 config is null");
        }
        throw new IllegalArgumentException("upload video config is null");
    }

    @Override // com.p2082ss.android.ugc.aweme.publish.p3625i.AbstractC65668b
    /* renamed from: a */
    public final void mo104666a(String str) {
        C89219l.m154721d(str, "");
        BDVideoUploader bDVideoUploader = this.f147762c;
        if (bDVideoUploader == null) {
            C89219l.m154710a("mActualUploader");
        }
        bDVideoUploader.setTraceId(str);
    }
}
