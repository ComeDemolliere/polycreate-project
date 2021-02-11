import 'http://fr.polytech.unice/polycreate'

ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"

package polycreate

	 --add DSE and MoCCML mapping here
	 context RobotProgram
	 	def : start : Event = self.start()

 endpackage