/*
 * generated by Xtext 2.14.0
 */
package fr.unice.polytech.si5.webots.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.unice.polytech.si5.webots.ide.contentassist.antlr.internal.InternalPolycreateParser;
import fr.unice.polytech.si5.webots.services.PolycreateGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PolycreateParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PolycreateGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PolycreateGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
			builder.put(grammarAccess.getDETECTIONAccess().getAlternatives(), "rule__DETECTION__Alternatives");
			builder.put(grammarAccess.getDIRECTIONAccess().getAlternatives(), "rule__DIRECTION__Alternatives");
			builder.put(grammarAccess.getRobotProgramAccess().getGroup(), "rule__RobotProgram__Group__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_2(), "rule__Transition__Group_2__0");
			builder.put(grammarAccess.getTransitionAccess().getGroup_2_3(), "rule__Transition__Group_2_3__0");
			builder.put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
			builder.put(grammarAccess.getStateAccess().getGroup_4(), "rule__State__Group_4__0");
			builder.put(grammarAccess.getStateAccess().getGroup_4_3(), "rule__State__Group_4_3__0");
			builder.put(grammarAccess.getStateAccess().getGroup_5(), "rule__State__Group_5__0");
			builder.put(grammarAccess.getStateAccess().getGroup_5_3(), "rule__State__Group_5_3__0");
			builder.put(grammarAccess.getSimpleConditionAccess().getGroup(), "rule__SimpleCondition__Group__0");
			builder.put(grammarAccess.getSimpleConditionAccess().getGroup_3(), "rule__SimpleCondition__Group_3__0");
			builder.put(grammarAccess.getMoveActionAccess().getGroup(), "rule__MoveAction__Group__0");
			builder.put(grammarAccess.getMoveActionAccess().getGroup_3(), "rule__MoveAction__Group_3__0");
			builder.put(grammarAccess.getMoveActionAccess().getGroup_4(), "rule__MoveAction__Group_4__0");
			builder.put(grammarAccess.getTurnActionAccess().getGroup(), "rule__TurnAction__Group__0");
			builder.put(grammarAccess.getTurnActionAccess().getGroup_3(), "rule__TurnAction__Group_3__0");
			builder.put(grammarAccess.getTurnActionAccess().getGroup_4(), "rule__TurnAction__Group_4__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
			builder.put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
			builder.put(grammarAccess.getRobotProgramAccess().getNameAssignment_2(), "rule__RobotProgram__NameAssignment_2");
			builder.put(grammarAccess.getRobotProgramAccess().getInitialStateAssignment_3(), "rule__RobotProgram__InitialStateAssignment_3");
			builder.put(grammarAccess.getRobotProgramAccess().getOwnedStatesAssignment_4(), "rule__RobotProgram__OwnedStatesAssignment_4");
			builder.put(grammarAccess.getRobotProgramAccess().getGlobalTransitionsAssignment_5(), "rule__RobotProgram__GlobalTransitionsAssignment_5");
			builder.put(grammarAccess.getTransitionAccess().getConditionsAssignment_2_2(), "rule__Transition__ConditionsAssignment_2_2");
			builder.put(grammarAccess.getTransitionAccess().getConditionsAssignment_2_3_1(), "rule__Transition__ConditionsAssignment_2_3_1");
			builder.put(grammarAccess.getTransitionAccess().getNextStateAssignment_4(), "rule__Transition__NextStateAssignment_4");
			builder.put(grammarAccess.getStateAccess().getNameAssignment_2(), "rule__State__NameAssignment_2");
			builder.put(grammarAccess.getStateAccess().getActionsAssignment_4_2(), "rule__State__ActionsAssignment_4_2");
			builder.put(grammarAccess.getStateAccess().getActionsAssignment_4_3_1(), "rule__State__ActionsAssignment_4_3_1");
			builder.put(grammarAccess.getStateAccess().getTransitionsAssignment_5_2(), "rule__State__TransitionsAssignment_5_2");
			builder.put(grammarAccess.getStateAccess().getTransitionsAssignment_5_3_1(), "rule__State__TransitionsAssignment_5_3_1");
			builder.put(grammarAccess.getSimpleConditionAccess().getDetectionTypeAssignment_3_1(), "rule__SimpleCondition__DetectionTypeAssignment_3_1");
			builder.put(grammarAccess.getMoveActionAccess().getDurationAssignment_3_1(), "rule__MoveAction__DurationAssignment_3_1");
			builder.put(grammarAccess.getMoveActionAccess().getDirectionAssignment_4_1(), "rule__MoveAction__DirectionAssignment_4_1");
			builder.put(grammarAccess.getTurnActionAccess().getDurationAssignment_3_1(), "rule__TurnAction__DurationAssignment_3_1");
			builder.put(grammarAccess.getTurnActionAccess().getAngleAssignment_4_1(), "rule__TurnAction__AngleAssignment_4_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PolycreateGrammarAccess grammarAccess;

	@Override
	protected InternalPolycreateParser createParser() {
		InternalPolycreateParser result = new InternalPolycreateParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PolycreateGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PolycreateGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
