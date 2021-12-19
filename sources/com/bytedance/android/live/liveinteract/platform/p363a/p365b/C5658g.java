package com.bytedance.android.live.liveinteract.platform.p363a.p365b;

import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4432f;
import com.bytedance.android.livesdk.model.message.C9606aj;
import com.bytedance.android.livesdk.model.message.C9617aq;
import com.bytedance.android.livesdk.model.message.C9618ar;
import com.bytedance.android.livesdk.model.message.C9619as;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC4432f(mo10206a = "LINK_MESSAGE_CENTER")
/* renamed from: com.bytedance.android.live.liveinteract.platform.a.b.g */
public final class C5658g implements OnMessageListener {

    /* renamed from: a */
    public final DataChannel f14379a;

    /* renamed from: b */
    private final List<AbstractC5656e> f14380b = new ArrayList();

    static {
        Covode.recordClassIndex(6255);
    }

    /* renamed from: a */
    public final void mo11437a(AbstractC5656e eVar) {
        C89219l.m154721d(eVar, "");
        this.f14380b.add(eVar);
    }

    public C5658g(DataChannel dataChannel) {
        C89219l.m154721d(dataChannel, "");
        this.f14379a = dataChannel;
    }

    /* renamed from: b */
    public final void mo11438b(AbstractC5656e eVar) {
        C89219l.m154721d(eVar, "");
        if (this.f14380b.contains(eVar)) {
            this.f14380b.remove(eVar);
        }
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        if (iMessage != null) {
            if (iMessage instanceof C9617aq) {
                int i = ((C9617aq) iMessage).f23387a;
                if (i == 8) {
                    List<AbstractC5656e> list = this.f14380b;
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (t instanceof AbstractC5653b) {
                            arrayList.add(t);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                } else if (i == 105) {
                    List<AbstractC5656e> list2 = this.f14380b;
                    ArrayList<AbstractC5653b> arrayList2 = new ArrayList();
                    for (T t2 : list2) {
                        if (t2 instanceof AbstractC5653b) {
                            arrayList2.add(t2);
                        }
                    }
                    for (AbstractC5653b bVar : arrayList2) {
                        bVar.mo10287a();
                    }
                }
            } else if (iMessage instanceof C9619as) {
                C9619as asVar = (C9619as) iMessage;
                C9618ar c = asVar.mo16572c();
                Long l = null;
                String str2 = c != null ? c.f23413e : null;
                C9618ar c2 = asVar.mo16572c();
                Integer valueOf = c2 != null ? Integer.valueOf(c2.f23415g) : null;
                try {
                    C9618ar c3 = ((C9619as) iMessage).mo16572c();
                    if (!(c3 == null || (str = c3.f23412d) == null)) {
                        l = Long.valueOf(Long.parseLong(str));
                    }
                    if (str2 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (valueOf == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    } else if (l != null) {
                        List<AbstractC5656e> list3 = this.f14380b;
                        ArrayList<AbstractC5655d> arrayList3 = new ArrayList();
                        for (T t3 : list3) {
                            if (t3 instanceof AbstractC5655d) {
                                arrayList3.add(t3);
                            }
                        }
                        for (AbstractC5655d dVar : arrayList3) {
                            dVar.mo10316c(l.longValue(), valueOf.intValue());
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } catch (Exception unused) {
                }
            } else if (iMessage instanceof C9606aj) {
                C9606aj ajVar = (C9606aj) iMessage;
                switch (ajVar.f23319a) {
                    case 2:
                        List<AbstractC5656e> list4 = this.f14380b;
                        ArrayList<AbstractC5654c> arrayList4 = new ArrayList();
                        for (T t4 : list4) {
                            if (t4 instanceof AbstractC5654c) {
                                arrayList4.add(t4);
                            }
                        }
                        for (AbstractC5654c cVar : arrayList4) {
                            cVar.mo10325a(ajVar);
                        }
                        return;
                    case 3:
                        List<AbstractC5656e> list5 = this.f14380b;
                        ArrayList<AbstractC5654c> arrayList5 = new ArrayList();
                        for (T t5 : list5) {
                            if (t5 instanceof AbstractC5654c) {
                                arrayList5.add(t5);
                            }
                        }
                        for (AbstractC5654c cVar2 : arrayList5) {
                            cVar2.mo10574b(ajVar);
                        }
                        return;
                    case 4:
                        List<AbstractC5656e> list6 = this.f14380b;
                        ArrayList<AbstractC5654c> arrayList6 = new ArrayList();
                        for (T t6 : list6) {
                            if (t6 instanceof AbstractC5654c) {
                                arrayList6.add(t6);
                            }
                        }
                        for (AbstractC5654c cVar3 : arrayList6) {
                            cVar3.mo11431g(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        List<AbstractC5656e> list7 = this.f14380b;
                        ArrayList<AbstractC5654c> arrayList7 = new ArrayList();
                        for (T t7 : list7) {
                            if (t7 instanceof AbstractC5654c) {
                                arrayList7.add(t7);
                            }
                        }
                        for (AbstractC5654c cVar4 : arrayList7) {
                            cVar4.mo10575c(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        List<AbstractC5656e> list8 = this.f14380b;
                        ArrayList<AbstractC5657f> arrayList8 = new ArrayList();
                        for (T t8 : list8) {
                            if (t8 instanceof AbstractC5657f) {
                                arrayList8.add(t8);
                            }
                        }
                        for (AbstractC5657f fVar : arrayList8) {
                            fVar.mo10577e(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        List<AbstractC5656e> list9 = this.f14380b;
                        ArrayList<AbstractC5657f> arrayList9 = new ArrayList();
                        for (T t9 : list9) {
                            if (t9 instanceof AbstractC5657f) {
                                arrayList9.add(t9);
                            }
                        }
                        for (AbstractC5657f fVar2 : arrayList9) {
                            fVar2.mo11436l(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                        List<AbstractC5656e> list10 = this.f14380b;
                        ArrayList<AbstractC5654c> arrayList10 = new ArrayList();
                        for (T t10 : list10) {
                            if (t10 instanceof AbstractC5654c) {
                                arrayList10.add(t10);
                            }
                        }
                        for (AbstractC5654c cVar5 : arrayList10) {
                            cVar5.mo11434j(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                        List<AbstractC5656e> list11 = this.f14380b;
                        ArrayList<AbstractC5654c> arrayList11 = new ArrayList();
                        for (T t11 : list11) {
                            if (t11 instanceof AbstractC5654c) {
                                arrayList11.add(t11);
                            }
                        }
                        for (AbstractC5654c cVar6 : arrayList11) {
                            cVar6.mo10576d(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                        List<AbstractC5656e> list12 = this.f14380b;
                        ArrayList<AbstractC5657f> arrayList12 = new ArrayList();
                        for (T t12 : list12) {
                            if (t12 instanceof AbstractC5657f) {
                                arrayList12.add(t12);
                            }
                        }
                        for (AbstractC5657f fVar3 : arrayList12) {
                            fVar3.mo11435k(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                        List<AbstractC5656e> list13 = this.f14380b;
                        ArrayList<AbstractC5657f> arrayList13 = new ArrayList();
                        for (T t13 : list13) {
                            if (t13 instanceof AbstractC5657f) {
                                arrayList13.add(t13);
                            }
                        }
                        for (AbstractC5657f fVar4 : arrayList13) {
                            fVar4.mo10578f(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                    default:
                        return;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                        List<AbstractC5656e> list14 = this.f14380b;
                        ArrayList<AbstractC5654c> arrayList14 = new ArrayList();
                        for (T t14 : list14) {
                            if (t14 instanceof AbstractC5654c) {
                                arrayList14.add(t14);
                            }
                        }
                        for (AbstractC5654c cVar7 : arrayList14) {
                            cVar7.mo11433i(ajVar);
                        }
                        return;
                    case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                        List<AbstractC5656e> list15 = this.f14380b;
                        ArrayList<AbstractC5654c> arrayList15 = new ArrayList();
                        for (T t15 : list15) {
                            if (t15 instanceof AbstractC5654c) {
                                arrayList15.add(t15);
                            }
                        }
                        for (AbstractC5654c cVar8 : arrayList15) {
                            cVar8.mo11432h(ajVar);
                        }
                        return;
                }
            }
        }
    }
}
