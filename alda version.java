# Blade runner End title theme

(tempo 119)

# synth bass arp in the background
midi-square-lead: 
	o2 
	(volume 50)
	[ c16 c d e+ ] *4
	%timpani
	[ c16 c d e+ ] *4
	[ c16 c d e+ ] *4
	%main
	[ c16 c d e+ ] *4
	[ c16 c d e+ ] *4
	[ c16 c d e+ ] *4
	[ c16 c d e+ ] *4
	[ c16 c d e+ ] *4
	[ c16 c d e+ ] *4
	[ c16 c d e+ ] *4
	[ c16 c d e+ ] *4
	[ c16 c d e+ ] *4
	[ c16 c d e+ ] *4
	%timpani2

midi-timpani: 
	o3
	@timpani
	[ f16 r <f r > ] *4
	@timpani2
	[ f16 r <f r > ] *4
	

# main melody
midi-synth-pad-polysynth:
	o3
	@main
	c1 < b-2 a- g r16 
	b-1 a2 g f r16
	a-1 g2 f d r16
	d+2 c1