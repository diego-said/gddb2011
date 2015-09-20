package br.com.doublelogic.parser;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by diegoalvessaidsimao on 18/09/15.
 */
public class GooglonParserTest {

    private GooglonParser parser;

    @Before
    public void input() {
        final String input = "fpck drjbssl vkml rnjnlmln tjrh znldfx mcw jnrmpm wzrwmc pbplrd mwm sppfpvz htjhdsz \n" +
                "\n" +
                "sjwdzkt rkn xjwbh khjbn sbg ngl wdnvkjdp ljbzcsnx rbcbhp jmrg ccck wdrdpj trcn xhzkkgz qkcx \n" +
                "\n" +
                "thldkc cht bdxpxx drvhgc qbw dtq jlnm rnf xvgjxhc thltvqxn hpxrhzsr mdw bcw xvz nkctqbt \n" +
                "\n" +
                "gxlqbz mnfmjcbc qbjjd jwsccl ltnj tfjwpmvg dttnn ndmgw kzgsbqjq tdsjhd kmlzwkbw djbz slsp \n" +
                "\n" +
                "rcqfrnb rmgbltvx tldr gbspn fkjhct lzhrgwj gfnzjms mxnjn xtxfxs lnvd vfphph qhzntpt hbhkwlfm \n" +
                "\n" +
                "vhc zhzhzfcw zldt bqcsqxmx hbl pfrw dvmnxvwp kplmdw bhj xtsz gzbsqxkc ntcb pgnmmlb \n" +
                "\n" +
                "nwx kcjmtt vqnn nxjkgnt jjxckzn dsjv bpnpkpkv zgxtl hfjzvj cpjvhj sclqq zksgq fbjb qbsr xnhz \n" +
                "\n" +
                "jnnrd npt kmblz tpkzprn nflbl hzfgkml glt svgx lwbxk xrfdhksn zlm rdhfzn nljcrd ktdmlhjf wnlq \n" +
                "\n" +
                "tfcjwq fzxfs mclx rxr dwl snh rxhcpctg vhgnprr gblbxdw xkl rhbcrwv tgdcd sgztvf hzf qfqc \n" +
                "\n" +
                "jqfwckft tvjgx wgpcm rfzvb vdcrjkss gsxgwh dlpgjm vgvlsnbl tkkckcbt mcwsgq kfxdhx vdpbfxk \n" +
                "\n" +
                "vtk vcqcgvrd qkzbgqz mjvxxjtq bdtcjl zfpd sbhrjr fsfqwd vkff gdlzfs xln stptk cwvwgc smhgv \n" +
                "\n" +
                "hwx rjsmj sxgnfbdz nmrpmmz crgkxvt zgcpwt rwljtsj dzjfvwpv nvs rnnvhtcq vblrnp mtlbgfpx \n" +
                "\n" +
                "gprmnp cbdzsx tfrf lwwhcl gncwpzd hzxtjw wfwpdz swb glzskxsh mmkng sdhbgjd klzclv qfz \n" +
                "\n" +
                "hkjmm pljh pnj rwlbvz pzst fbcqhm ggkff jnlqtcr vljk gphkq wkt xqvjhbhk qgq xjdrmg dtdmlwd \n" +
                "\n" +
                "dmm hgmhcw jlgndzsd rmnxfmt zfnmrjpt hbft nqdq lshxfhz ncp tswnqst qnr mjsbnkq fxkzwnr \n" +
                "\n" +
                "xthgs bhftbt wrmbmqm zpbmt nhngxccw kjn zjknxr jvgm xzr njw ldllwr qfwbs dwhf shf zkzhq \n" +
                "\n" +
                "qsfhvxfg gcww mdv nlmtcqrr qfdwm tzqn ngfs mkmhxqfm nhdkfdgm kttd rqdww bvsvcks dzwz \n" +
                "\n" +
                "wbvkdd ngfcsxzv xqpml dphnnp lbvdhgv jxzxf hmw dbvfp mqfmswzf rzm cngjjfc vhlfw ggpjd \n" +
                "\n" +
                "zzqtp cfztjr gbctptg wdfgfwqq zvz lkscsbh qpwrn dqcdq xgkn kdfx zqtxf lbpzd gwz ssrrf dwbjm \n" +
                "\n" +
                "mqssk knpd xnlbf cglsfnqr qgc jlkqrwx frmbkmvf kwnp rwmqk tpgdhb tvgk zxjzwsb ncjdfng \n" +
                "\n" +
                "wqglwlh qhmclwd sfgkhrs hqp gxdzzxjk csjnqqqp jgtsr kjwnmv xjpg xjjcghg mdcsw dhscm \n" +
                "\n" +
                "ktwgd tvpgdj srjsn mvrnxlg xqpmjs tzzh blkfdpl jqb ntcpm rzvwmj stp wmbwnmcn pmmgtxjd \n" +
                "\n" +
                "fhss qztxhss mfxgfgw wbrddrtz jhvzrs jgp fkmpgv mkmf pzrh wmrwhps gqbg cbpwqwms brvjs \n" +
                "\n" +
                "ldlzpsl zzlgrdd jdpcpxdb nmqzlf sddk rsvp wrrnsntn fvw jfj nklltxsb mpk gbvx jlsxv nkthhv vqq \n" +
                "\n" +
                "rtfw dlqwt hkmqjn kbwrxt wfrs fmb rxjpbbn bzgwtlc zrgpr vqfxrdj nzxtfrzz tqq wqmxmlz \n" +
                "\n" +
                "pkhbgvsf wmthx sqlj pcb fdndvxsb xjbn hsbps fgktpw xpfth jbmpk zbzp hjmnw pcxrwmwh fncb \n" +
                "\n" +
                "pbjtzbp rzwpj zcfmsdfx slnsm hbdsk rzjqfc rhz cphb pmdstjn wgbk wjcxfggl zscnbp xbh lgwpw \n" +
                "\n" +
                "hdckc kxmlqr nrcgjb rtrtc kgvnxmc txsdqclg mjc ckpgjvs ndsbsf nnj mqdgrmfs mgcshwmr \n" +
                "\n" +
                "gvvsfb vxh jndjqzk rvhtqms tvqp hgmx mpswd wjcsrw phxkwp psfnrf dlzrlp qrqb zlzrwd \n" +
                "\n" +
                "hgbdjwn vfgd fnl xmq zrmk cjt rhfrjfbg mpqjq vhxlhqkq rqwrkz rgppv shzjkltl kczdnk gptz \n" +
                "\n" +
                "nmwcwvv ckdfmcf zktjzdx tcx vgks xcpcdlt fbr pmvvf ljgm qwxw stp nfgrmbdr wpfdnwl gdg \n" +
                "\n" +
                "mnwrmvh ckvwfdr bktr mjcnwzck xxrkskwl dtrzdq lcbgm vdqf bqzhfz qszdmj wzddq dmrkx \n" +
                "\n" +
                "bpjfgl vwjsw jmmjxwq rplzz qkxgvq kqbqcfg kfhgzdcq zrxwcv wmhtg lmjt jxb hhfwlpz xcpnzcpv \n" +
                "\n" +
                "ghftdr jdwztg dkgj nhvpd jtfhctpv bwbsq smpxtzx wfckbjw zsttsgdc vmdld pspc vrvjthdg spfh \n" +
                "\n" +
                "kdbl pmkhtf blldhpzx nhjtp ksjbtzm rbvvn ccb jrgdfc chmm dgftxztx lmp qch pgf xwhzmrxm \n" +
                "\n" +
                "nxnkpgc ghmvx kvnsfz dhr wtnmjvrp nmvptf qztvgtwk qlv fxtv zdjxx pzcr qjs wwdfnc kwfv \n" +
                "\n" +
                "pctzhlg rdbfkp jgs mjfnsm mnpnw fms fbq fbnxncsv hnrwjc vgh xcww cpbjxx xfgwksn hsftk \n" +
                "\n" +
                "wptrzxzb xxbtnmxk pjm rnfxg qnng kqhss bqf lsfsrgs dzrrfmds mflvrsqw cgh mqp bkk nzpw \n" +
                "\n" +
                "wvw trzkvvz vxcjvvz fglgkbdv phvsgf nfwmwssg fbxfvqx txhfrw jmlrqcr dsmxxcnm ccx vqjbw \n" +
                "\n" +
                "cgp mzpk jrnwj hwxv msprntrh gmjgw jnxxdbf gcjrbms ktphkbpf xwqt hwbfm dgmk xhvtrwr \n" +
                "\n" +
                "dtsf sbrq mnqnv phx crkshvz rdhktr bgpzw flxdtffs pvfqwgrg sgr vljppsfc jtkgw kfdzqmfv wvjs \n" +
                "\n" +
                "gpgjtwsj wbtpjnt qzzkq snsvq llbfzl lhnqcdd dlbljqp jcncrh lkq hwzzqdxs jlsk ggzqfq jwvghsj \n" +
                "\n" +
                "kskbrwt kvt brrffkll hfc fkdwqmn jgjfqmr vxwkldh hdjfthrg nll zxzp jqqrzxd fqbmpngf dbwn jtrx \n" +
                "\n" +
                "jnj tmzt sqr ktfbl vjqszjn tsdfbdqk zlkxtfrb flpc hdn rbrwz fmzmtfhc wrbcsm dms ljsmcqd ttnjtg \n" +
                "\n" +
                "kgtp qctlwflj mmd";
        parser = new GooglonParser(input);
    }

    @Test
    public void testCountPrepositions() {
        assertEquals(66, parser.countPrepositions());
    }

    @Test
    public void testCountVerbs() {
        assertEquals(26, parser.countVerbs());
    }

    @Test
    public void testCountFirstPersonVerbs() {
        assertEquals(4, parser.countFirstPersonVerbs());
    }

}